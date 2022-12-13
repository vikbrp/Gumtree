package main.service;

import main.Constants.Constants;
import main.dto.EmployeeDetails;
import main.utility.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public Long findNumberOfMales(List<EmployeeDetails> employeeDetails) {
        return employeeDetails.stream().filter(x -> null != x.getGender() && x.getGender().equalsIgnoreCase(Constants.male)).count();
    }

    @Override
    public String findOldestEmployee(List<EmployeeDetails> employeeDetails) {
        EmployeeDetails oldestEmployee = employeeDetails.stream().filter(emp -> null != emp.getDateOfBirth())
                .min(EmployeeUtil.employeeDetailsComparator()).orElse(null);
        return (null != oldestEmployee ? oldestEmployee.getName(): null);
    }

    @Override
    public Long findAgeDifference(List<EmployeeDetails> employeeDetails) {

        List<EmployeeDetails> filteredNames = employeeDetails.stream().filter(x-> Constants.names.contains(x.getName()))
                .sorted(EmployeeUtil.employeeDetailsComparator()).collect(Collectors.toList());
        return EmployeeUtil.findDifferenceInDays(filteredNames.get(0).getDateOfBirth(), filteredNames.get(1).getDateOfBirth());

    }

}
