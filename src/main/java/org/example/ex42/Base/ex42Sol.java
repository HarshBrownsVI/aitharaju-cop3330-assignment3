package org.example.ex42.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex42Sol
{
    public static void main(String[] args) throws IOException
    {
        // Create object employeeInfo
        // read info from txt file and print it out
        SortEmployeeInfo employeeInfo = new SortEmployeeInfo();
        String file = "exercise42_input.txt";
        List<EmployeesInfo> info = employeeInfo.readEInfo(file);
        employeeInfo.printEInfo(info);
    }

}
