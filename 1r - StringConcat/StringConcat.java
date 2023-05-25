// This program prompts the user to enter any amount of strings until the word "stop" is inputted.
// Then the program will place "not" and spacing between each string input.

import java.util.Scanner;
public class StringConcat { 
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   System.out.println("Please enter some Strings: ");
   String Concat = ""; 
   String Input = kb.next();
   while (!(Input.equalsIgnoreCase("stop"))) { 
   Concat = Concat + Input + " not ";
   Input = kb.next();
   }
   int x = Concat.length();
   int y = x - 5; 
   Concat = Concat.substring(0,y) 
      + ".";
   System.out.print(Concat);
   }
}