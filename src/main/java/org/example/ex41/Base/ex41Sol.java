package org.example.ex41.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex41Sol
{
    public static void main(String[] args) throws IOException {
        // Create a NameSorter object called name
        // Create a String named file
        // Read the names into a list
        // Sort the names
        // Print out the names to the output file
        NameSorter name = new NameSorter();
        String file = "exercise41_input.txt";
        List<Name> names = name.readNames(file);
        Collections.sort(names);
        List<Name> sorted = names;
        name.printNamesToTxt(sorted, new File("exercise41_output.txt"));
    }
}
