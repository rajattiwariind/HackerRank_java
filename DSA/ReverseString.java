import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        A = A.toLowerCase();
        String cadenaInvertida = "";

        char caracter;
        for(int i=A.length()-1;i>=0;i--){
            caracter = A.charAt(i);
            cadenaInvertida+=caracter;
        }
        if(A.equals(cadenaInvertida)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
