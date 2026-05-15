package oops_tuto;
class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x=x;
        this.y=y;

    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");

    }
}
public class ComplexNumberClass {
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(2, 3);
        c1.print();
        ComplexNumber c2 = new ComplexNumber(4, -5);
        c2.print();
    }
}