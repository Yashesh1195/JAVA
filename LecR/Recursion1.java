//  Print all the permutations of a string
// Time Complexity :- O(n*n!) 
public class Recursion1 {

    public static void printPerm(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        String perm = "";
        printPerm(str, perm);
    }
}