// Print all unique subsequences of a string
// Time COmplexity - O(2^n)

import java.util.HashSet;

public class Recursion8_imp {
    public static void subsequences(String str, int index, String newString, HashSet<String> set) {
        if(index == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        
        // to be
        subsequences(str, index+1, newString+currChar, set);

        // or not to be
        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }    
}
