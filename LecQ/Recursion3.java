//  Find the first and last occurrence of an element using recursion
public class Recursion3 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int index, char element) {
        if(index == str.length()) {
            System.out.println("First Occurence: " + first);
            System.out.println("Last Occurence: " + last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element) {
            if(first == -1) {
                first = index;
            }
            else {
                last = index;
            }
        }
        findOccurence(str, index+1, element);
    }
    
    public static void main(String[] args) {
        String str = "yashesh";
        char element = 'h';
        findOccurence(str, 0, element);
    }
}
