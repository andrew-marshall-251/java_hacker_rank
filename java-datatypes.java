import java.util.*;

class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (Byte.MIN_VALUE <= x && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (Short.MIN_VALUE <= x && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (Long.MIN_VALUE <= x && x <= Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
