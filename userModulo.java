import java.util.Scanner;
public class userModulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter divisor: ");
        int b = sc.nextInt();
        int r = a%b;
        System.out.println("The remainder when "+a+" is divided by "+b+" is "+r);
        
    }
}
