// Print all the subsequences of a string
//  Time Complexity - O(2^n)
// Subsequences = 2^n, n=no. of char.s, 2 = no. of choices
// E.g.- str = "abc"
// Here, n=3
// Subsequences = 2^3 = 8

public class Recursion7_imp {
    public static void subsequences(String str, int index, String newString) {
        if(index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        
        // to be
        subsequences(str, index+1, newString+currChar);

        // or not to be
        subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
