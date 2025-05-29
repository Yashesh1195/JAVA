package LecN;
import java.util.*;
public class Practice3 {
    // Method to count number of 1's using Brian Kernighan’s Algorithm
    public static int countOnes(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1); // Clears the least significant bit set
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = countOnes(n);

        System.out.println("Binary Representation: " + Integer.toBinaryString(n));
        System.out.println("Number of 1's in Binary: " + count);

        sc.close();
    }
}
