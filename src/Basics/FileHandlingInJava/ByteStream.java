package Basics.FileHandlingInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("data.txt");
        f.write(65);
//        f.close();


        FileInputStream fi = new FileInputStream("data.txt");
        System.out.println(fi.read());

        // this is mostly used in 8bits of the data
    }
}
