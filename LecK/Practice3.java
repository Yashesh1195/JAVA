package LecK;
import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //E-mail as input
        System.out.print("Enter your e-mail :- ");
        String email = sc.next();

        // String userName = "";

        // //Making username by breaking the e-mail
        // for(int i=0; i<email.length(); i++){
        //     if(email.charAt(i) == '@') {
        //         break;
        //     }
        //     else {
        //         userName += email.charAt(i);
        //     }
        // }

        //=======
        //OR
        //=======

        String userName = email.split("@")[0];

        System.out.println("Username is :- " + userName);


        sc.close();
    }
}
