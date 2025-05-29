package LecN;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Enter the position to toggle (Starting from 0): ");
        int pos = sc.nextInt();

        int toggledNum = n ^ (1 << pos);

        System.out.println("Original Number: " + Integer.toBinaryString(num));
        System.out.println("Toggled Number: " + Integer.toBinaryString(toggledNum));
        System.out.println("Toggled Number in Decimal: " + toggledNum);
    }
}
