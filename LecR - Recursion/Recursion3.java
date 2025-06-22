// Tiling problem - Place Tiles of size 1xm in a floor of size nxm
// Time Complexity - O()
public class Recursion3 {
    public static int placeTiles(int n, int m) {

        // Base Case - 1
        if(n == m) {
            return 2;
        }

        // Base Case - 2
        if(n < m) {
            return 1;
        }

        // vertically
        int vertPlacements = placeTiles(n-m, m);
        
        // horizontally
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        int tilesPlacement = placeTiles(n, m);
        System.out.println(tilesPlacement);
    }
}
