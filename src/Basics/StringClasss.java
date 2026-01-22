package Basics;

public class StringClasss {
    public static void main(String[] args) {
//        String msg = new String("Hello world");
        String msg = "Hello World...! ";
        System.out.println(msg);
        System.out.println(msg.endsWith(".!"));
        System.out.println(msg.startsWith("He"));
        System.out.println(msg.indexOf((".")));
        System.out.println(msg.indexOf("sky"));
        System.out.println(msg.replace("." , "*"));
        System.out.println(msg); // orignal one is not changed at all
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
    }
}
