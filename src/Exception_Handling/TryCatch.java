package Exception_Handling;
import java.io.File;
import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("file.txt"));
            System.out.println("File found successfully....!");
        }
        catch(Exception e){
            System.out.println("File not found");
            System.out.println(e);
        }
    }
}
