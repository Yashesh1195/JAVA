// Print all Permutations 
// Time Complexity - O(n * n!)

public class BackTracking1 {
    public static void printPerm(String str, String permutation, int idx) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation + currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "", 0);
    }
}