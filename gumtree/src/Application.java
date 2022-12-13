import main.dto.EmployeeDetails;
import java.io.IOException;
import main.service.EmployeeService;
import main.service.EmployeeServiceImpl;
import java.util.List;
import main.utility.AddressBookFileReader;

public class Application {


    public static void main(String[] args) throws IOException {
        List<EmployeeDetails> employeeList = AddressBookFileReader.readAddressBook();
        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println("Bill is " + employeeService.findAgeDifference(employeeList) + " days older than Paul.");
        System.out.println("There are " + employeeService.findNumberOfMales(employeeList) + " male employees.");
        System.out.println("Oldest employee is " + employeeService.findOldestEmployee(employeeList));

    }
}
