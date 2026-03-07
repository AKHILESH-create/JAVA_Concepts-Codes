import java.util.Scanner;
public class nestedIfElseDivi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            if(n%15!=0){

            
            System.out.print("The number is Divisible");
        }else{
            System.out.println("Not Matching the required condition");
        }
        
    }else{
        System.out.println("Not Matching the required condition");

    }

    }
}
