import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.print(i + " ");
            System.out.println(line);
            i++;
        }
    }
}
