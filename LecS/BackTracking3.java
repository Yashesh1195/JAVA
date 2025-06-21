import java.util.List;
import java.util.ArrayList;

public class BackTracking3 {
    public static void printPerm(int[] arr, List<Integer> permutation, int idx) {

        for(int i=0; i<arr.length; i++) {
            int currInt = arr[i];
            List<Integer> newArr = new ArrayList<>();
            for(int j=i; j<arr.length; j++) {
                newArr.add(arr[j]);
            }
            newArr.remove(arr[i]);
            printPerm(arr, permutation.add(currInt), idx);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        List<Integer> permutation = new ArrayList<>(); 
        printPerm(arr, permutation, 0);
    }
}
