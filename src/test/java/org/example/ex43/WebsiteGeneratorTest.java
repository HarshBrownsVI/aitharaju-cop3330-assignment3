package org.example.ex43;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.*;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void exists()
    {
        WebsiteGenerator w = new WebsiteGenerator();
       File temp = new File("C:\\Users\\harsh\\Awesomeco");
        boolean exist = w.exists(temp);
        boolean exp = false;

        assertEquals(exp, exist);
    }

    @Test
    void exists_2()
    {
        WebsiteGenerator w = new WebsiteGenerator();
        File temp = new File("C:\\Users\\harsh\\aitharaju-cop3330-ex23\\Ex23\\src\\.idea");
        boolean exist = w.exists(temp);
        boolean exp = true;

        assertEquals(exp, exist);
    }
}