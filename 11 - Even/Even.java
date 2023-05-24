// This program intakes 25 inputs and displays true if there are an even number of even numbers in the 25 inputs. Otherwise it displays false.

import java.util.Scanner; 
import java.util.Arrays; 
public class Even { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter 25 Integers: "); 
      int even = 0;
      int evenlist[] = new int [25]; 
      for (int i = 0; i < evenlist.length; i++) { 
         evenlist[i] = keyboard.nextInt(); } 
      for (int e = 0; e < evenlist.length; e++) { 
         if (evenlist[e]%2 == 0) { 
            even += 1; } 
      }
      if (even%2 == 0)
         System.out.println("true");
      else
         System.out.println("false");            
   }
}