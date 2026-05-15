package oops_tuto;
public class Constructors{
    public static class Car{
        int price;
        String name;
        Car(){

        }
        Car(int, price, String name){
            this.price= price;
            this.name= name;

        }
        Car(String s, int x){
            this.price = x;
            name=s;
        }
        void.print(){
            int price = 12;
            System.out.println(this.price:+" "+ name);

        }
    }
    public static void main(String[] args){
        Car c1 = new Car(200000, "BMW");
        c1.print();
        Car c2 = new Car("Audi", 300000);
        c2.print();
        Car c3 = new Car();
        c3.name = "Mercedes";
    }
}