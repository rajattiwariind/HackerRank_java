import java.util.Scanner;
public class Solution {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
        try {
            long a = in.nextLong();
            System.out.print(a + " can be fitted in:\n");

            if (a >= q(8) && a <= p(8)) {
                System.out.print("* byte\n");
            }

            if (a >= q(16) && a <= p(16)) {
                System.out.print("* short\n");
            }

            if (a >= q(32) && a <= p(32)) {
                System.out.print("* int\n");
            }

            if (a >= q(64) && a <= p(64)) {
                System.out.print("* long\n");
            }
        } catch (Exception e) {
            System.out.println(in.next() + " can't be fitted anywhere.");
        }
    }
    in.close();
}

public static long q(int n) {
    return (long) Math.pow(-2, n - 1);
}

public static long p(int n) {
    return (long) (Math.pow(2, n - 1) - 1);
}
}
