// This program takes an inputted string from the user and counts the number of s and S characters. 

import java.util.Scanner;
public class Counting { 
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   int Ss = 0;
   String Count = "";
   System.out.println("Enter a String: ");
   String Str = kb.next(); 
   int len = Str.length(); 
   for (int c = 0; c<len; c++) { 
   Count = Count + Str.charAt(c);
   if (Count.equalsIgnoreCase("s")) { 
      Ss += 1; 
      }
   Count = "";
   }
   System.out.print("Number of s and S character(s): " + Ss);
   }
}