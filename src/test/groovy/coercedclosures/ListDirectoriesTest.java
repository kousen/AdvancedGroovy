package coercedclosures;

import static org.junit.Assert.*;

import java.io.File;


import org.junit.Test;

import coercedclosures.ListDirectories;

public class ListDirectoriesTest {
    private ListDirectories ld = new ListDirectories();

    @Test
    public void testListDirectoryNames() {
        String[] dirs = ld.listDirectoryNames("/");
        for (String name : dirs) {
            System.out.println(name);
            assertTrue(new File(name).isDirectory());
        }
    }

}
