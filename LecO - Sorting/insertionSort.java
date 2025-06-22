import java.util.Scanner;

public class insertionSort {
    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //denoting the size of the array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        //Getting elements of the array
        int arr[] = new int[size];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //time complexity = O(n^2)
        //insertion sort
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }

        printArray(arr);

        sc.close();
    }
}
