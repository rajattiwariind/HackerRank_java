

 import java.util.*;

public class Solution {

public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();

   for(int i = 0; i < n; i++)
   {
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();

       int sum = a;
       for(int j = 0; j < c; j++)
       {
           sum +=Math.pow(2,j)*b;
           System.out.print(sum + " ");
       }
       System.out.println();
   }
}
}
