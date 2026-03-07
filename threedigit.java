 import java.util.Scanner;
 public class threedigit{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n>99 && n<1000){
            System.out.print("This is a three digit number");
        
        }
        else{
            System.out.println("It is not a three digit number");
            
        }


    }

 }
