package LecJ;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the 2D Array:- ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int i, j;

        int[][] numbers = new int[rows][cols];

        //Input
        System.out.println("Enter the elements of the Array:- ");
        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output- Transpose of the entered matrix
        System.out.println("Transpose of the Matrix:- ");
        for(j=0; j<cols; j++){
            for(i=0; i<rows; i++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
