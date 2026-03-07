import java.util.Scanner;
public class ifelseProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price:");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("You gained a profit");


        }else if(cp>sp){
            System.out.println("You incurred a loss");
        }
    }
}
