package LecK;
import java.util.*;
public class Strings {
    public static void main(String[] args) {

        //String Declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String dialogue = "I Am Iron Man!!!!!!!";

    //     Scanner sc = new Scanner(System.in);
    //     // String name = sc.next();
    //     String name = sc.nextLine();
    //     System.out.println("Your name is- "+name);
    //     sc.close();

    //============
    //Concatnation
    //============

    // String firstName = "Tony";
    // String lastName = "Stark";
    // String fullName = firstName + " " +lastName;
    // System.out.println(fullName);

    //Print length of a String[.length()]
    // System.out.println(fullName.length());

    //Access characters of a string[.charAt(arg)]
    // for(int i = 0; i < fullName.length(); i++){
    //     System.out.println(fullName.charAt(i));
    // }

    //Compare 2 strings
    // String name1 = "Tony";
    // String name2 = "Tony";

    //1 s1 > s2 : +ve value
    //2 s1 == s2 : 0
    //3 s1 < s2 : -ve value

    // if(name1.compareTo(name2) == 0) {
    //     System.out.println("Strings are equal");
    // }
    // else {
    //     System.out.println("Strings are not equal");
    // }

    //Don't do this
    // if(name1 == name2) {
    //     System.out.println("Strings are equal");
    // }
    // else {
    //     System.out.println("Strings are not equal");
    // }

    //Don't do this
    // if(new String("Tony") == new String("Tony")) {
    //     System.out.println("Strings are equal");
    // }
    // else {
    //     System.out.println("Strings are not equal");
    // }

    // Substring
    // String sentence = "My name is Tony";
    // String sentence = "TonyStark";
    // String name = sentence.substring(4);
    // System.out.println(name);

    // ParseInt Method of Integer class
    // String str = "123";
    // int num = Integer.parseInt(str);
    // System.out.println(num);

    // ToString Method of String class
    int num = 123;
    String str = Integer.toString(num);
    System.out.println(str);


    }
}
