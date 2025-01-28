package LecI;
import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        
        //Input
        System.out.println("Enter the elements of the array:- ");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 0; i < size-1; i++){
            if(num[i] > num[i+1]){
                isSorted = false;
            }
        }

        if(isSorted == true){
            System.out.println("Array is sorted in ascending order!!");
        }
        else{
            System.out.println("Array is not sorted in ascending order!!");
        }

        sc.close();
    }
}
