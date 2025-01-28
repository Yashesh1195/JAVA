package Exercise1;
import java.util.*;
public class Main4 {
    public static double circumference(double r){
        double circum = 2*3.14*r;
        return circum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double cir = circumference(r);
        System.out.println("Circumference = "+cir);
        sc.close();
    }
}
