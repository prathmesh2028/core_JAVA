package OOPs_in_java.RecordClass;

import java.util.Objects;

//class Alien
//{
//    private int id;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    private String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}

record Alien(int id , String name){}

public class RecordClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(1 , "Prathmesh");
        Alien a2 = new Alien(1 , "Prathmesh");
        System.out.println(a1.equals(a2));

        System.out.println(a1);
        System.out.println(a2);
    }
}
