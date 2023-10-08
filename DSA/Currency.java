import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double payment = sc.nextDouble();

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String i = in.format(payment);
        String u = us.format(payment);
        String f = fr.format(payment);
        String c = ch.format(payment);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}
