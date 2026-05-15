package oops_tuto;
class Cricketer{
    static string country = "NZ";
    int runs;
    String names;
    double avg;


}
public class FinalAndStatic{
    public static void main(String[] args){
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);

    }
}