import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

       s= s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
            System.exit(0);
        }
       String [] data=s.split("[\\s , ' . ? @ _ !]+");
        System.out.println(data.length);
        for(String x:data)
        {
            System.out.println(x);
        }
       
        scan.close();
    }
}
