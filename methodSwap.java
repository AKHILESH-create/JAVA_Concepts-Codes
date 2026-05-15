import java.util.Scanner;
public class methodSwap{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
        

    }
}