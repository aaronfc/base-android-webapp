package net.nebur.basewebapp.utils;

import java.io.File;

/**
 * FileUtils class.
 * This file contains some methods for the sake of simplicity when managing files.
 */
public class FileUtils {

    /**
     * Method used to remove a file or directory recursively.
     * @param target Target to be removed
     */
    public static void remove(File target) {
        if (target.isDirectory()) {
            for (File file : target.listFiles()) {
                remove(file);
            }
        } else {
            target.delete();
        }
    }
}