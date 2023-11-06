import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String paymentInIndia = in.format(payment);
        String paymentInUS = us.format(payment);
        String paymentInFrance = fr.format(payment);
        String paymentInChina = ch.format(payment);

        System.out.println("US: " + paymentInUS);
        System.out.println("India: " + paymentInIndia);
        System.out.println("China: " + paymentInChina);
        System.out.println("France: " + paymentInFrance);
    }
}
