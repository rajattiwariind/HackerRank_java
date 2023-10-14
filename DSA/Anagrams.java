import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        
        scan.close();
        
        char[] listA = a.toCharArray();
   
        if (isAnagrams(listA, b)) {
            System.out.println("Anagrams");
        } else{
            System.out.println("Not Anagrams");
        }
        
    }
    
    public static boolean isAnagrams(char[] listA, String b) {
        
        if (listA.length != b.length()) return false;
        
        for (char element : listA) {
            if (b.contains(String.valueOf(element))) {
                b = b.replaceFirst(String.valueOf(element), "");
            } else {
                return false;
            }
        }
        
        return true;
        
    }
}
