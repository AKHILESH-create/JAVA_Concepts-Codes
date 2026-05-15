package oops_tuto;
public class Constructor{
    public static class Car{
        int seats;
        String name;
        double length;
        Car(){
        }
        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;

        }
        void print(){
            System.out.println(seats+" "+ name+" "+length);

        }
    }
    public static void main(String[] args){
        Car c1 = new Car(4,"BMW", 4.5);
        c1.print();
        Car c2 = new Car(3,"Audi", 4.2);
        c2.print();
        Car c3 = new Car();
        c3.name = "Mercedes";
    } 
}