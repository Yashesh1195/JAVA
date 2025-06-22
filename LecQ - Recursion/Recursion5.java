// Move all ‘x’ to the end of the string.
// Time Complexity - O(n)

public class Recursion5 {
    public static void moveAllX(String str, int index, int count, String newString) {
        if(index == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x') {
            count++;
            moveAllX(str, index+1, count, newString);
        }
        else {
            newString += currChar;
            moveAllX(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "yxshxsh";
        String newStr = "";
        moveAllX(str, 0, 0, newStr);
    }
}
