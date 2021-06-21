package org.example.ex41.Base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void readNames() throws IOException {
        String file = "exercise41_input.txt";
        NameSorter names = new NameSorter();
        List<Name> list= new ArrayList<Name>();
        list.add(0, new Name("Johnson", "Jim"));
        list.add(1, new Name("Jones", "Aaron"));
        list.add(2, new Name("Jones", "Chris"));
        list.add(3, new Name("Ling", "Mai"));
        list.add(4, new Name("Swift", "Geoffrey"));
        list.add(5, new Name("Xiong", "Fong"));
        list.add(6, new Name("Zarnecki", "Sabrina"));
        List<Name> list2 = names.readNames(file);
        Collections.sort(list2);
        assertEquals(list, list2);
    }
}