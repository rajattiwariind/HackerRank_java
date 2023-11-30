    import java.util.Scanner;
    public class solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int counter =0;
        for(int i = 1; i<= n ; i++){
            
            if(n%i == 0){
  
            counter += 1;
            }
            else if(n%i <1){
               
                System.out.println("not prime");
            }
        }
            if(counter>2){
                System.out.println("not prime");
            }
            else if(counter ==2 ){
                System.out.println("prime");
            }
            else if(counter == 1){
                System.out.println("not prime");
            }
                               
    }
}
