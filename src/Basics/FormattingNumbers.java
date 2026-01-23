package Basics;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String r = currency.format(1234567.891);
//        System.out.println(r); //₹1,234,567.89

        NumberFormat currency = NumberFormat.getPercentInstance();
        String r = currency.format(0.12);
        System.out.println(r); // 12%

    }
}
