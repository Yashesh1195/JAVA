public class Recursion1 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer of disc-" + n + " from " + src + " to " + dest);
            return;
        }
        
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer of disc-" + n + " from " + src + " to " + dest);
        
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}

// Time COmplexity: O(2^n - 1) ~= O(2^n)