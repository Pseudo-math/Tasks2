package Java;

import java.util.*;
import java.io.File;

public class RecursionEighth {
    public static ArrayList<File> recursionSearch(File path, String file) {
        if (!(path.exists() && path.isDirectory()))
            throw new IllegalArgumentException("path is not found or path is not directory");
        ArrayList <File> searchedFiles = new ArrayList<>();
        for (var currentFile : path.listFiles()) {
            if (currentFile.isDirectory())
                searchedFiles.addAll(recursionSearch(currentFile, file));
            else if (currentFile.getName().equals(file))
                searchedFiles.add(currentFile);
        }
        return searchedFiles;
    }
}
