import java.util.*;

public class Practice_LL_1 {

    public static int search(LinkedList<Integer> list, int num) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == num) {
                return (int)i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);     
        list.add(5);     
        list.add(7);     
        list.add(3);     
        list.add(8);     
        list.add(2);     
        list.add(3);
        System.out.println(list);     

        int index = search(list, 7);

        if(index != -1) {
            System.out.println("Index is : " + index);
        } else {
            System.out.println("Not Found!!");
        }
        
    }
}
