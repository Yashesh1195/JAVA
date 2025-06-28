import java.util.*;

public class Practice_LL_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " in the range of 1 - 50 : ");
        for(int i=0; i<n; i++) {
            int val = sc.nextInt();

            if(val >= 1 && val <= 50) {
                list.add(val);
            }
            else {
                System.out.println("Enter valid number");
                i--;
            }
        }

        System.out.println("Linked List : " + list);

        list.removeIf(num -> num > 25);

        System.out.println("Kist after removing elements >25 : " + list);

        sc.close();
        
    }    
}
