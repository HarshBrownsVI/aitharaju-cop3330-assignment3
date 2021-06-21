package org.example.ex42.Base;

import org.example.ex41.Base.Name;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SortEmployeeInfo
{
    // Create a List to add the employees to
    // Create try catch to open the file
    // Check to see if there is still characters to read in the file.
    // Split the file based on where the commas are and store them in an array
    // If there is, add the employees info to the list
    // Return the list
    public static List<EmployeesInfo> readEInfo(String file) throws FileNotFoundException {
        List<EmployeesInfo> employee = new ArrayList<EmployeesInfo>();
        BufferedReader read = new BufferedReader(new FileReader(file));
        try {
            String line;
            while ((line = read.readLine()) != null) {
                String[] firstandlast = line.split(",");
                if (firstandlast != null && firstandlast.length > 1)
                    employee.add(new EmployeesInfo(firstandlast[0], firstandlast[1], firstandlast[2]));
            }
        }
         catch (Throwable e) {
            e.printStackTrace();
        }

        return employee;
    }

    // If the file exists, return true, if not return false
    public static boolean exists(File file)
    {
        return file.exists();
    }


    // Print out the list
    public void printEInfo(List<EmployeesInfo> employeesInfos) {
        System.out.println("Last\t\tFirst\t\tSalary");
        System.out.println("-----------------------------\n");
        for(int i = 0; i < employeesInfos.size(); i++)
        {
            System.out.println(employeesInfos.get(i).getLastName() + "\t" + employeesInfos.get(i).getFirstName() +  "\t" + employeesInfos.get(i).getSalary());
        }
    }

}
