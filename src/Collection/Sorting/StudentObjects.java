package Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StudentObjects {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        Comparator<Student> c = (Student o1, Student o2) -> (o1.age > o2.age) ? 1 : -1;

        l.add(new Student(21 , "Prathmesh"));
        l.add(new Student(99 , "Tanmay"));
        l.add(new Student(23 , "Dhiraj"));
        l.add(new Student(29 , "Samiksha"));
        l.add(new Student(55 , "Rashii"));
        l.add(new Student(41 , "Sakshi"));
        l.add(new Student(15 , "Rupali"));

        System.out.println(l);
        Collections.sort(l , c);
        System.out.println(l);
    }
}
