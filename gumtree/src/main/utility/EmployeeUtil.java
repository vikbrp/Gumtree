package main.utility;

import main.dto.EmployeeDetails;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class EmployeeUtil {

    public static Comparator<EmployeeDetails> employeeDetailsComparator (){
        return Comparator.comparing(EmployeeDetails::getDateOfBirth);
    }
    public static long findDifferenceInDays(LocalDate firstDate, LocalDate secondDate){
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}
