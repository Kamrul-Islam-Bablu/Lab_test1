package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {
         public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int x;
        x=scan.nextInt();
        if(x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Negative");
        }
        else System.out.println("Zero");
            
}
}

