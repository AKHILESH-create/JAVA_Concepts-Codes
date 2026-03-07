import java.util.Scanner;
public class sidesOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        if(a+b > c && b+c>a && a+c>b){
            System.out.println("The sides form a valid triangle.");
        }
        else{
            System.out.println("Invalid Triangle");
        }


    }
}
