package OOPs_in_java.ENum;


// enum is a class but it cannot be extended that's all
enum Status
{
    Running , Failed , Pending , Success;
}

public class Demo {
    public static void main(String[] args) {
//        int i = 5;
        Status s = Status.Success;
//        System.out.println(s.ordinal()); // op - 3
        System.out.println(s.getClass().getSuperclass());
        Status[] ss = Status.values();
//        for(int i = 0 ; i < ss.length ; i++) System.out.println(ss[i]);
//        for(Status st:ss) System.out.println(st + " " + st.ordinal());

        s = Status.Pending;
        if( s == Status.Running)
            System.out.println("All good");
        else if(s == Status.Failed)
            System.out.println("Try again");
        else if ( s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");


        // switch looks good in case of enums
        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Success:
                System.out.println("Done...!");
                break;
            default:
                System.out.println("All good here");
        }

    }
}
