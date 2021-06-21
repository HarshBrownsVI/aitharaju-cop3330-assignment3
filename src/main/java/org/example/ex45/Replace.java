package org.example.ex45;

import org.example.ex41.Base.Name;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Replace
{
    /*
        Use bufferedReader to create a reader of the file
        Split the words using a delimitor and the split method
        While there are still words to be scanned,
        return the text file converted into a string
        If file does not exist, throw exception.

    */
    public static String readFile(String file) throws FileNotFoundException {
        BufferedReader read = new BufferedReader(new FileReader(file));
        String res = "";
        try {
            String line;
            while ((line = read.readLine()) != null) {
                String[] words = line.split(", ");
                if (words != null && words.length > 1)
                    return new String(Files.readString(Path.of((file))));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return res;
    }
    // Create a printwriter to write the file
    // Create try catch to open the file
    // Write the file from the input and write the path of the filename into a string
    //If the file does not exist, throw an exception
    public void write(String phrase, String filename) throws IOException
    {
        PrintWriter p = new PrintWriter(filename);
        try(p) {
            Files.writeString(Paths.get(String.valueOf(filename)), phrase);
        }catch (Throwable e) {
            e.printStackTrace();
        }
    }


    }

