import java.util.*;

// Naive Approach [Using Sorting]
// Time Complexity: O(n*log(n))
// Space Complexity: O(1)
// class Day1_Second_largest {
//     public static int getSecondLargestElement(int[] arr) {
//         int n = arr.length;

//         Arrays.sort(arr);

//         for(int i=n-2; i>=0; i--) {
//             if(arr[i] != arr[n-1]) {
//                 return arr[i];
//             }
//         }

//         return -1;
        
//     }
//     public static void main(String args[]) {
//         int arr[] = {34, 53, 11, 26, 1, 20, 53};

//         System.out.println("Second Largest Element is : " + getSecondLargestElement(arr));
//     }
// }

// [Better Approach] Two Pass Search
// Time Complexity: O(2*n) = O(n), as we are traversing the array two times.
// Space Complexity: O(1), as no extra space is required.
// class Day1_Second_largest {
//     public static int getSecondLargestElement(int[] arr) {
//         int n = arr.length;

//         int largest = -1, secondLargest = -1;

//         // Finding the largest element
//         for(int i=0; i<n; i++) {
//             if(arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }

//         // Finding the second largest element
//         for(int i=0; i<n; i++) {
//             if(arr[i] > secondLargest & arr[i] != largest) {
//                 secondLargest =arr[i];
//             }
//         }

//         return secondLargest;
        
//     }
//     public static void main(String[] args) {
//         int arr[] = {34, 53, 11, 26, 1, 20, 53};

//         System.out.println("Second Largest Element is : " + getSecondLargestElement(arr));
//     }
// }

// [Expected Approach] One Pass Search
// Time Complexity: O(n), as we are traversing the array only once.
// Space Complexity: O(1)
class Day1_Second_largest {
    public static int getSecondLargestElement(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Finding the largest and secondlargest element simultaneously in one pass
        for(int i=0; i<n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] < largest & arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        

        return secondLargest;
        
    }
    public static void main(String[] args) {
        int arr[] = {34, 53, 11, 26, 1, 20, 53};

        System.out.println("Second Largest Element is : " + getSecondLargestElement(arr));
    }
}