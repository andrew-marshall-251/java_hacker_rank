import java.util.*;

public class Solution {
    private static boolean is_open(char c) {
        if (c == '(') {
            return true;
        }
        if (c == '{') {
            return true;
        }
        if (c == '[') {
            return true;
        }
        return false;
    }
    
    private static boolean is_closed(char c) {
        if (c == ')') {
            return true;
        }
        if (c == '}') {
            return true;
        }
        if (c == ']') {
            return true;
        }
        return false;
    }
    
    private static boolean  is_pair(char open, char closed) {
        if (open == '(' && closed == ')')
            return true;
        if (open == '{' && closed == '}')
            return true;
        if (open == '[' && closed == ']')
            return true;
        return false;
    }
    
    private static void    is_balanced(String s) {
        Stack<Character> char_stack = new Stack<>();
        char        last_popped;
        for (char c: s.toCharArray()) {
            if (is_open(c)) {
                char_stack.push(c);
            } else if (is_closed(c) && char_stack.empty()) {
                System.out.println("false");
                return ;
            } else if (is_closed(c) && !char_stack.empty()) {
                last_popped = char_stack.pop();
                if (!is_pair(last_popped, c)) {
                    System.out.println("false");
                    return ;
                }
            }
        }
        if (char_stack.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            is_balanced(sc.nextLine());
        }
        sc.close();
    }
}

