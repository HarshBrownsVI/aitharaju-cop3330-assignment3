package org.example.ex45;

import javax.print.DocFlavor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ex45Sol
{
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        Replace r = new Replace();
        String file = r.readFile("ex45_input.txt");
        System.out.println("What is the name of the output file?");
        String updated = kb.nextLine();
        String change = file.replaceAll("utilize", "use");
        r.write(change, updated);

    }
}
