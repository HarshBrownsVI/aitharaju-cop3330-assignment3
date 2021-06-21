package org.example.ex43;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WebsiteGenerator
{
    // create a try catch to open the file
    //Create a path called directory and create it using the site given by the user
    // update the exists variable based on whether the path exists
    // if the file doesn't exist, throw an exception
    // Return whether the file exists or not in the directory.
    public static boolean dir(String path)
    {
        boolean exists = false;

        try {
            Path directory = java.nio.file.Files.createDirectory(Paths.get(path));
            exists = java.nio.file.Files.exists(directory);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return exists;
    }


    // If the file exists, return true, if not return false
    public static boolean exists(File file)
    {
        return file.exists();
    }

    //Create new file in the format of an html file
    // Create a bufferedwriter to write the information into the new file
    // Create a try catch to open the file
    // Write the title and name of the author, formatting it in html style
    // If file does not exist, throw an exception
    //Return whether the file exists or not
    public static boolean createIndex(String site, String author) throws IOException {
        File f = new File(String.format("%s/index.html", site));
        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        try (writer) {
            writer.write(String.format("  <title>%s</title>%n", site));
            writer.write(String.format("  <meta name=\"author\" content=\"%s\">%n", author));
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return f.exists();
    }



}
