// Check if an array is sorted (strictly increasing).
// Time COmplexity - O(n)
public class Recursion4 {
    public static boolean isSorted(int arr[], int index) {
        if(index == arr.length-1) {
            return true;
        }

        if(arr[index] < arr[index+1]) {
            //array is sorted till now
            return isSorted(arr, index+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 4, 1, 6, 2};

        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
    }
}
