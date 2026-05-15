package oops_tuto;
class Student{
    String name;
    private int rno;
    double cgpa;
    void print(){
        System.out.println(name+" "+cgpa+" "+rno);

    }
}
    public class privateKeyword{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Harsh ";
        s1.cgpa = 8.8;
        //s1.rno= 23;
        s1.print();

    }
}
