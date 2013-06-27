package coercedclosures;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirectories {
    public String[] listDirectoryNames(String root) {
        return new File(root).list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(name).isDirectory();
            }
        });
    }
}
