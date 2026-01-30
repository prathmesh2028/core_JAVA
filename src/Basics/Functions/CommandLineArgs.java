package Basics.Functions;

public class CommandLineArgs {
    public static void main(String[] args) {
        int n = args.length;
        if(n > 0){
            System.out.println("Printing the arguements :");
            for(String arg: args){
                System.out.print(arg + " ");
            }
        }
        else{
            System.out.println("No command Line arguements ");
        }
    }
}
