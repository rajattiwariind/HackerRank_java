import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();

        List<String> ls = new ArrayList<String>();

        for (int i = 0; i < s.length() - k+1; i++) {
            String sub = s.substring(i, i+k);
            ls.add(sub);
        }

        Collections.sort(ls);

        String smallest = ls.get(0);
        String largest = ls.get(s.length()-k);

        System.out.println(smallest);
        System.out.println(largest);

    }
}
