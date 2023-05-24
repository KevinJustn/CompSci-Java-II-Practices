// This program takes an inputted string from the user and reverses it.

import java.util.Scanner;
public class Reverse { 
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   String reverseStr = "";
   System.out.println("Enter a String: ");
   String Str = kb.next(); 
   int x = Str.length();
   for (int c=1;c<=x;c++) { 
   reverseStr = reverseStr + Str.charAt(x-c);
   }
   System.out.print(reverseStr);
   }
}