// This program prompts the user to enter 10 strings, then computes the total length of all the strings together.

import java.util.Scanner;
public class TotalLength { 
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter 10 Strings: ");
   int TL = 0;
   for (int x = 0; x<10; x++) { 
   String Str = kb.next(); 
   TL = TL + Str.length(); } 
   System.out.print("The total length of the strings is " + TL + " characters.");
   }
}