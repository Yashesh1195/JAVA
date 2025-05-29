package LecN;
import java.net.SocketPermission;
import java.util.*;
public class BitManipulation {
    public static void main(String args[]) {
        
        //=======
        //Get Bit
        //=======
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // if((bitMask & n) == 0) {
        //     System.out.println("Bit is 0");
        // }
        // else {
        //     System.out.println("Bit is 1");
        // }

        //=======
        //Set Bit
        //=======
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //=========
        //Clear Bit
        //=========
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        //==========
        //Update Bit
        //==========
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 => set, oper = 0 => clear
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
