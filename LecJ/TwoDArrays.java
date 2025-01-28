package LecJ;
import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D Array:- ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        int[][] numbers = new int[rows][columns];

        //Input
        System.out.println("Enter elements of 2D Array:- ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to be found:- ");
        int x = sc.nextInt();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i][j] == x){
                    System.out.println("x is found at location (" + i + ", "+ j +")");
                }
            }
            // System.out.println();
        }

        sc.close();
    }
}
