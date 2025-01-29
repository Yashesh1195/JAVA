package LecL;
// import java.util.*;
public class Strings {
    public static void main(String args[]) {

        //Declaration
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        //char at index[0]
        // System.out.println(sb.charAt(0));

        //set char at index[0]
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        //Insert new char at specific index keeping previous char as it is
        // sb.insert(0, 'S');
        // sb.insert(2, 'n');
        // System.out.println(sb);

        //Delete char from the StringBuilder from specific index
        //(2, 3) means it will delete the char at index 2 i.e. from 2 to 2(3-1)
        // (2, 4) means it will delete the char at index 2 & 3 i.e. from 2 to 3(4-1)
        // sb.delete(2, 4);
        // System.out.println(sb);

        // Append a char 
        // Append means to add something at the end.

        // StringBuilder sb = new StringBuilder("h");
        // System.out.println(sb);
        // sb.append("e"); //str = str + "e"
        // sb.append("l"); //str = str + "l"
        // sb.append("l"); //str = str + "l"
        // sb.append("o"); //str = str + "o"
        // System.out.println(sb);

        //Print Length of String
        // System.out.println(sb.length());

        //Reverse a string

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1; //5-0-1 = 4th position

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
