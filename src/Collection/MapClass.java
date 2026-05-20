package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap();

        students.put("Prathmesh" , 99);
        students.put("Tanmay" , 78);
        students.put("Dhiraj" , 16);
        students.put("Sakshi" , 86);
        students.put("Shrushti" , 74);
        students.put("Harsh" , 45);

        System.out.println(students);
        System.out.println(students.get("Prathmesh"));
        System.out.println(students.keySet());
        for(String name : students.keySet())
        {
            System.out.println(name + " : " + students.get(name));
        }

    }
}
