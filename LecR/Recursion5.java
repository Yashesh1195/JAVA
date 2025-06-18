// Subsets of a set - Print all the subsets of a set of first n natural numbers
// Time Complexity - O(2)

import java.util.ArrayList;

public class Recursion5 {

    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubsets(subset);
            return;
        }
        // if it is added
        subset.add(n);
        findSubsets(n-1, subset);

        // if it is added
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }   
}
