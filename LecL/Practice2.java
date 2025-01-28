package LecL;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :- ");
        String str = sc.next();

        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result.append('i');
            }
            else {
                result.append(str.charAt(i));
            }
        }

        //======
        // OR
        //======

        // //Replace all occurences of 'e' with 'i'
        // String result = str.replace('e', 'i');

        System.out.println("Resulting string :- "+result.toString());

        sc.close();
    }
}
