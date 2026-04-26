import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int B;
    private static int H;
    private static Scanner sc; 
    private static boolean flag; 
    static {
        try {
            sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
            flag = true;
        } catch (Exception e) {
            System.out.println(e);
            flag = false;
        } finally {
            sc.close();
        }
    }    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


