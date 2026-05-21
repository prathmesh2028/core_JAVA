package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prathmesh" , "Sakshi" , "Laxmi" , "Tanmay");
//        List<String> uNames = names.stream()
////                .map(name -> name.toUpperCase())
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(uNames);
//        uNames.forEach(System.out::println);

        List<Student> students = new ArrayList<>();
//        for(String name:names)
//        {
//            students.add(new Student(name));
//        }
        // doing the above same thing using the stream :)
        students = names.stream()
                        .map(name -> new Student(name))
                                .toList();

        students = names.stream()
                .map(Student::new)    // constructor reference here
                .toList();

        System.out.println(students);



    }
}
