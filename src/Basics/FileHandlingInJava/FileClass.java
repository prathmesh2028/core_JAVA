package Basics.FileHandlingInJava;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File f = new File("data.txt");
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.lastModified());
        System.out.println(f.length());
    }
}
