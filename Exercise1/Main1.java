package Exercise1;
import java.util.*;
public class Main1 {
    public static void average(int a, int b, int c){
        float avg = (float)(a+b+c)/3;
        System.out.println("Average = "+avg);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a, b, c);
        sc.close();
    }
}
