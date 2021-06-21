package org.example.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ex46Sol
{
    public static void main(String[] args) throws IOException {
     // Create object word from the WordFrequency class
    WordFrequency word = new WordFrequency();
    String name = "exercise46_input.txt";
    // Create a hashmap to store the key and value pairs of the words
    HashMap<String, Integer> map = word.count(name);
    // Print out each key and for the number of values, print an *
        map.forEach((k, v) -> {
            System.out.printf(k + ":");
            System.out.println("*".repeat(v.intValue()));
        });

    }
}
