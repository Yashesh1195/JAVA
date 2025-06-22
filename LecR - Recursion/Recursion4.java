// Friends pairing problem - . Find the number of ways in which you can invite n people to your party, single or in pairs
public class Recursion4 {
    public static int pairFriends(int n) {

        // Base Case
        if(n <= 1) {
            return 1;
        }

        //single
        int ways1 = pairFriends(n-1);
        
        //pair
        int ways2 = (n-1)*pairFriends(n-2);

        return ways1 + ways2;

        // OR
        // return pairFriends(n-1) + (n-1) * pairFriends(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairFriends(n));
    }
}
