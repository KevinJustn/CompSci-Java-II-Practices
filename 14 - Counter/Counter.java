// This program prompts the user for a string input, then after promps for a character to search for. 
// The program will return how many occurences of the inputted character appear in the inputted string.

import java.util.Scanner;
public class Counter { 
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   int count = 0;
   String Count = "";
   System.out.println("Enter a String: ");
   String Str = kb.next(); 
   System.out.println("Enter the search character: ");
   String Search = kb.next();
   int len = Str.length(); 
   for (int c = 0; c<len; c++) { 
   Count = Count + Str.charAt(c);
   if (Count.equals(Search)) { 
      count += 1; 
      }
   Count = "";
   }
   System.out.print("The character " + Search + " appears " + count + " time(s).");
   }
}