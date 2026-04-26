import java.util.*;

public class Solution {
    private static boolean canWinDFS(int currPos, int leap, int[] game) {
        // won
        if (currPos >= game.length) {
            return true;
        }
    
        // invalid move
        if (currPos < 0 || game[currPos] == 1) {
            return false;
        }
       
        // mark visited 
        game[currPos] = 1;
        
        return canWinDFS(currPos - 1, leap, game) ||
                canWinDFS(currPos + 1, leap, game) ||
                canWinDFS(currPos + leap, leap, game);
    }
        
    public static boolean canWin(int leap, int[] game) {
        return canWinDFS(0, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
