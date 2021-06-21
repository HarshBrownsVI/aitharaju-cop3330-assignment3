package org.example.ex43;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ex43Sol {
    public static void main(String[] args) throws IOException {
        // Create variables to store user input for all the questions
        // Create an object based on the WebsiteGenerator class
        String siteName, author, js, css;
        WebsiteGenerator w = new WebsiteGenerator();
        Scanner kb = new Scanner(System.in);
        System.out.println("Site Name: ");
        siteName = kb.next();
        System.out.println("Author: ");
        author = kb.next();
        System.out.println("Do you want a folder for JavaScript?");
        js = kb.next();
        System.out.println("Do you want a folder for CSS?");
        css = kb.next();

        boolean isCreated = w.dir(siteName);
        System.out.printf("Created ./%s%n", siteName);


        isCreated = w.createIndex(siteName, author);
        if (isCreated) {
            System.out.printf("Created ./%s/index.html%n", siteName);
        }

        if (js.equalsIgnoreCase("y")) {
            isCreated = w.dir(siteName + "/js");
            if (isCreated) {
                System.out.printf("Created ./%s/js%n", siteName);
            }
        }

        if (css.equalsIgnoreCase("y")) {
            isCreated = w.dir(siteName + "/css");
            if (isCreated) {
                System.out.printf("Created ./%s/css%n", siteName);
            }
        }
    }

    
}
