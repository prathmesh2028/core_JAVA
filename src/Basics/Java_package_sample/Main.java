package Basics.Java_package_sample;

import Basics.Java_package_sample.Sample_package.AdvCalc;
import Basics.Java_package_sample.Sample_package.Calc;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        AdvCalc ac = new AdvCalc();

        System.out.println(c.add(4,3));
        System.out.println(c.sub(9,8));
//        c.multiply(5,3); // error
        System.out.println(ac.multi(6,5));
        System.out.println(ac.div(5,2));
    }
}
