package OOPs_in_java.SealedClasses;

sealed class A  extends Thread implements Cloneable permits B,C
{

}

non-sealed class B extends A {

}

final class C extends A {

}

final class D extends B
{

}

public class SealedClassEx {
    public static void main(String[] args) {

    }
}
