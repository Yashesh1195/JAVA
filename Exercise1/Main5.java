package Exercise1;
import java.util.*;
public class Main5 {
    public static void eligibility(int age){
        if(age>18){
            System.out.println("Person is Eligible");
            return;
        }
        else{
            System.out.println("Person is not eligible");
            return;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibility(age);
        sc.close();
    }
}
