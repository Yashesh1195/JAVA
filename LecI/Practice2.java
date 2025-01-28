// Find the maximum & minimum number in an array of integers. 

package LecI;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] num = new int[size];

    //input
    for(int i=0; i<size; i++){
        num[i] = sc.nextInt();
    }

    int min = num[0];
    int max = num[0];

    //output
    for(int i=0; i<num.length; i++){
        if(num[i] > max){
            max = num[i];
        }
        
        if(num[i] < min){
            min = num[i];
        }
    }

    System.out.println("Maximum value = "+max);
    System.out.println("Minimum value = "+min);
    sc.close();
    }
}
