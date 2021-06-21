package org.example.ex42.Base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortEmployeeInfoTest {

    @Test
    void readEInfo_true()
    {
        SortEmployeeInfo e = new SortEmployeeInfo();
        File temp = new File("C:\\Users\\harsh\\aitharaju-cop3330-assignment3");
        boolean actual = e.exists(temp);
        assertEquals(true, actual);
    }

    @Test
    void readEInfo_false()
    {
        SortEmployeeInfo e = new SortEmployeeInfo();
        File temp = new File("C:\\Users\\harsh\\amazing");
        boolean actual = e.exists(temp);
        assertEquals(false, actual);
    }
}