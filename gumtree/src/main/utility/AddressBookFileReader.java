package main.utility;

import main.dto.EmployeeDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AddressBookFileReader {


    public static List<EmployeeDetails> readAddressBook() throws IOException {
        File file = new File("C:\\safeExpress\\latestSetUp\\codebase\\UAT\\master\\bil_configuration\\gumtree\\src\\resources\\addressBook");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new java.io.FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st;
        List<EmployeeDetails> employeeList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy", Locale.ENGLISH);
        while (null != br && (st = br.readLine()) != null) {
            EmployeeDetails addressBookDetails = new EmployeeDetails();
                String[] array = st.split(", ");
                addressBookDetails.setName(array[0]);
                addressBookDetails.setGender(array[1]);
                addressBookDetails.setDateOfBirth(LocalDate.parse((array[2]),formatter));
                employeeList.add(addressBookDetails);
        }
        return employeeList;
    }
}
