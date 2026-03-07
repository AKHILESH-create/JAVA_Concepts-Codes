import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n%5==0){
            if (n%3==0){
                System.out.println("The number is Divisible");

            }else{
                System.out.println("Not Divisible");

            }
        }else{
            System.out.println("Not Divisible");
        }
    }

}

