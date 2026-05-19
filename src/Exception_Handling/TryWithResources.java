package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException , IOException {
        int num = 0;
//        InputStreamReader in = null;
//        BufferedReader br = null;
//        try
//        {
//            in = new InputStreamReader(System.in);
//            br = new BufferedReader(in);
//            num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//        }
//        catch(Exception e)
//        {
//            System.out.println("Something went wrong");
//        }
//        finally
//        {
//            System.out.println("Closing the resources.......");
//            br.close();
//            in.close();
//        }



        // resources in try () are autoclosable :)
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("Closing the resources.......");
//            br.close();
//            in.close();
        }
    }
}
