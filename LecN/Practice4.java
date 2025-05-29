package LecN;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class Practice4 {
    public static void decimalToBinary(int decimal) {
        System.out.println("Decimal to Binary Representation: " + Integer.toBinaryString(decimal));
    }

    public static void binaryToDecimal(String binary) {
        System.out.println("Decimal to Binary Representation: " + Integer.parseInt(binary, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimalInput = sc.nextInt();
        decimalToBinary(decimalInput);

        System.out.println("Enter a binary number: ");
        String binaryInput = sc.next();
        binaryToDecimal(binaryInput);

        sc.close();
    }
}
