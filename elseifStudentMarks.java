import java.util.Scanner;
public class elseifStudentMarks {
    public static void main(String[] args)
     { Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int n = sc.nextInt();
        if(n>90){
            System.out.println("Excellent");

            }else if(n>80){
                System.out.println("Very Good");
            }else if(n>70){
                System.out.println("Good");
            }else if(n>60){
                System.out.println("To be better");

            }else{
                System.out.println("Fail");
            }
}
}

