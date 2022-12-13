package main.service;

import main.dto.EmployeeDetails;

import java.util.List;

public interface EmployeeService {

    Long findNumberOfMales(List<EmployeeDetails> employeeDetails);

    String findOldestEmployee (List<EmployeeDetails> employeeDetails);

    Long findAgeDifference(List<EmployeeDetails> employeeDetails);


}
