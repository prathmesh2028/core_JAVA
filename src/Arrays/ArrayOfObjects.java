package Arrays;

class Student
{
    int roll;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args)
    {
        Student students[] = new Student[3];
        for(int i = 0 ; i < students.length ; i++)
        {
            students[i] = new Student();
        }
        students[0].name = "Prathmesh";
        students[0].roll = 21;
        students[0].marks = 100;

        students[1].name = "Tanmay";
        students[1].roll = 1;
        students[1].marks = 97;

        students[2].name = "Dhiraj";
        students[2].roll = 3;
        students[2].marks = 87;


        for(int i = 0 ; i < students.length ; i++)
        {
            System.out.println("Student " + (i+1));
            System.out.println();
            System.out.println(students[i].name);
            System.out.println(students[i].roll);
            System.out.println(students[i].marks);
            System.out.println();
        }



        // using for each loop
        for(Student stud: students)
        {
            System.out.println("Student " );
            System.out.println();
            System.out.println(stud.name);
            System.out.println(stud.roll);
            System.out.println(stud.marks);
            System.out.println();
        }

    }
}
