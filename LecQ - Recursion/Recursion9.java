//  Print keypad combination
//  ( 0 -> .;
//  1 -> abc
//  2 -> def
//  3 -> ghi
//  4 -> jkl
//  5 -> mno
//  6 -> pqrs
//  7 -> tu
//  8 -> vwx
//  9 -> yz
//  )

// Time Complexity - O(4^n)

public class Recursion9 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static void printComb(String str, int index, String combination) {
        if(index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printComb(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "2";
        // String str = "327";
        printComb(str, 0, "");
    }
}
