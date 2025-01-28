package Exercise1;
import java.util.Scanner;
public class Main8 {
    public static double power(int x, int n){
        return Math.pow(x, n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        double pow = power(x, n);
        System.out.println(pow);
        sc.close();
    }
}
