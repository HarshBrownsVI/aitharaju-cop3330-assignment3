package org.example.ex46;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public class WordFrequency
{
    // Create global variable freq ,a hashmap to store the words and count
    // Create global variable to store the word
    public static LinkedHashMap<String, Integer> freq= new LinkedHashMap<String, Integer>();
    public static String word;
    // Create BufferedReader to read the lines in the txt file
    // Create a try catch to read the contents of the file
    // Split the words based on the space while there are still content from the file to read
    // If the word is not in the hashmap, then add it w the value 1
    // If it is increment the count of the key by 1
    // Return the map
    public static LinkedHashMap<String, Integer> count(String file) throws FileNotFoundException {
        BufferedReader read = new BufferedReader(new FileReader(file));
        String res = "";
        try {
            String line;
            while ((line = read.readLine()) != null) {
                String[] words = line.split(" ");
                if (freq != null && words != null && words.length > 1)
                {
                    if (freq.containsKey(word))
                        freq.put(word, 1);
                    else {
                        int count = freq.get(word);
                        freq.put(word, count++);
                    }
                }

            }
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return freq;
    }


}
