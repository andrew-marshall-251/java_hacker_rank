import java.util.*;

// learned that List.remove(Object x)
// and List.remove(int x) are overloaded
//
// Integer inherits from Object class while int is primitive
// Generics only work with Objects so you need
// Collection<Integer> and not Collection<int>
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
    
        String query;
        int x;    
        int y;    
        for (int i = 0; i < q; i++) {
            query = sc.next();
            if (query.equals("Insert")) {
                x = sc.nextInt();
                y = sc.nextInt();
                l.add(x, y);
            } else if (query.equals("Delete")) {
                x = sc.nextInt();
                l.remove(x);
            }
        }
        
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i != l.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
