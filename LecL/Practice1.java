package LecL;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt();
        sc.nextLine();// Consume the leftover newLine Character

        StringBuilder array = new StringBuilder();
        int toLength = 0;

        for(int i=0; i<size; i++) {
            String input = sc.nextLine();
            array.append(input);
            toLength += input.length();
        }

        System.out.println("Length of these strings:-" +  toLength);

        sc.close();
    }
}
