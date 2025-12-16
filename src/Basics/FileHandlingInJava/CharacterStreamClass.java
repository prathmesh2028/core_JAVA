package Basics.FileHandlingInJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamClass {
    public static void main(String[] args) throws IOException {

        // for writing a file
//        FileWriter fw = new FileWriter("data.txt");
//        fw.write("HELLO MY NAME IS PRATHMESH HANUAMTN BADHE FROM NAGAR :)");
//        fw.close();



        // for reading a file
        FileReader fr = new FileReader("data.txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
