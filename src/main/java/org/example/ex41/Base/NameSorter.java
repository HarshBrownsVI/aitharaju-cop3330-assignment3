package org.example.ex41.Base;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;

public class NameSorter {
    // Create a new List to store the names
    // Create a try catch to read the file
    // Split the words by the delimiter and add the names to the list if there is more to read on the file
    // If the file is not found, throw an exception
    // Return the list of names
    public static List<Name> readNames(String file) throws FileNotFoundException {
        List<Name> names = new ArrayList<Name>();
        BufferedReader read = new BufferedReader(new FileReader(file));
        try {
            String line;
            while ((line = read.readLine()) != null) {
                String[] firstandlast = line.split(", ");
                if (firstandlast != null && firstandlast.length > 1)
                    names.add(new Name(firstandlast[0], firstandlast[1]));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return names;
    }


    // Create a printwriter to print the names to the output file
    // Create a try catch to print the names
    // If the file exists, print out the names to an output file,
    // or if it doesn't exists throw an exception

    public void printNamesToTxt(List<Name> names, File filename) throws IOException {
        try (var writer = new PrintWriter(new FileWriter(filename))) {
            writer.printf("Total of %d names%n", names.size());
            writer.println("-----------------");
            names.forEach(name -> writer.println(name));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}