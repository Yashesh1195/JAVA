package LecD;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //================================
        //Print the sum of first n numbers
        //================================
        // int n = sc.nextInt();
        // int i;
        // int sum = 0;
        // for(i = 1; i <= n; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum = "+sum);
        
        //=====================================
        // To print the table of a number input by the user
        //=====================================
        int n = sc.nextInt();
        int i;
        for(i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        sc.close();
    }
}
