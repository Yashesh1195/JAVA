package LecN;
import java.util.*;
public class Practice1 {
    public static boolean isPowerOfTwo(int n) {
        return (n>0) && ((n & (n - 1)) == 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if(isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2");
        } else {
            System.out.println(num + " is not a power of 2");
        }
    }
}
