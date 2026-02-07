package OOPs_in_java.Polymorphism;
abstract class Employee{
    abstract void raiseSalary();
    abstract void promote();
}
class Manager extends Employee{
    @Override
    public void raiseSalary(){
        System.out.println("Salary of manager raised...!");
    }
    @Override
    public void promote(){
        System.out.println("Manager promoted to the senior manager");
    }
}
class Engineer extends Employee{
    @Override
    public void raiseSalary(){
        System.out.println("Salary of Engineer raised...!");
    }
    @Override
    public void promote(){
        System.out.println("Engineer promoted to the senior Engineer");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employees[] = {new Manager() , new Engineer()};


        // increasing everyones salary
        for(Employee e: employees){
            e.raiseSalary();
        }

        // promoting all
        for(Employee e: employees){
            e.promote();
        }
    }
}
