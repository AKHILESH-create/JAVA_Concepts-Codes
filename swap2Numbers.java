public class swap2Numbers{
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b+ "swap fun");

    }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println(a+" "+ b + "main fun");
        swap(a,b);
        System.out.println(a+" "+b+"main fun");
    }
}