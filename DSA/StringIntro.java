 import java.util.Scanner;

public class Solution {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    sc.close();

            //sum the lengths of A and B
    System.out.println(A.length()+B.length());

            //lexicographically greater
     if (A.compareTo(B) > 0) {
        System.out.println("Yes");
    } else {
        System.out.println("No");

    }

     //capitalize
    A = A.substring(0, 1).toUpperCase() + A.substring(1);
    B = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(A + " " + B);
  } 
}
