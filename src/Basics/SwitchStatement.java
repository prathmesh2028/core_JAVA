package Basics;

public class SwitchStatement {
    public static void main(String[] args) {

        int n = 1;

        switch(n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day matched :)");

        }

        // newer version of switch statement :)
        int day = 4;
        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };

        System.out.println(result);
    }
}
