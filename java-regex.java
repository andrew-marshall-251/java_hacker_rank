import java.util.*;

public class Solution {
    public static boolean isValidChar(char c) {
        if ('0' <= c && c <= '9')
            return true;
        if (c == '.')
            return true;
        return false;
    }
    
    public static boolean isValidInt(int a) {
        if (0 <= a && a <= 255)
            return true;
        return false;
    }
    
    public static boolean isValidIP(String ip_str) {
        // check for only valid chars
        for (char c: ip_str.toCharArray()){
            if (!isValidChar(c)) {
                return false;
            }
        }
        String[] byte_fields = ip_str.split("\\.");
        // check for valid . placement
        if (byte_fields.length != 4) {
            return false;
        }
        // check for valid max length of ascii byte representation
        for (String byte_field: byte_fields) {
            if (byte_field.length() > 3) {
                return false;
            }
            if (!isValidInt(Integer.parseInt(byte_field))) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            if (isValidIP(sc.nextLine()))
                System.out.println("true");
            else {
                System.out.println("false");
            }
        }
        
        sc.close();
    }
}

