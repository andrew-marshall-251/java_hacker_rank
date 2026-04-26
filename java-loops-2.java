import java.util.*;

class Solution{
    public static String getResultSequence(int a, int b, int n) {
        StringBuilder sb = new StringBuilder();
        int el;
        
        for (int i = 0; i < n; i++) {
            el = a;
            for (int j = 0; j < i + 1; j++) {
                el += (1 << j) * b;
            }
            sb.append(el);
            if (i != n - 1)
                sb.append(" ");
        }
        return (sb.toString());
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(getResultSequence(a, b, n));
        }
        in.close();
    }

