package LecI;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0] = 97;//phy
        // marks[1] = 98;//chem
        // marks[2] = 99;//maths
        // int[] marks = {97, 98, 99};
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i = 0; i < 3; i++){
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array:- ");
        // int size = sc.nextInt();
        // int[] numbers = new int[size];


        // System.out.println("Enter elements of array:- ");

        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // System.out.println("Elements:-");

        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }


        //======================
        //Linear Search
        //======================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int size = sc.nextInt();
        int[] numbers = new int[size];


        System.out.println("Enter elements of array:- ");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number whose index is to be found:- ");
        int x = sc.nextInt();

        // System.out.println("Elements:-");

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index:- "+i);
            }
        }

        sc.close();
    }
}
