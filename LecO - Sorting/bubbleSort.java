import java.util.*;

class bubbleSort {
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
        //bubble sort
        for(int i = 0; i < size-1; i++) { //n-1
            for(int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }

        printArray(arr);

        sc.close();
    }
}