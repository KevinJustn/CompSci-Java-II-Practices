// This program takes 10 inputs and returns the average as well as its minimum value.

import java.util.Scanner; 
public class MinAvg { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.println("Please enter 10 digits separately: ");
      int x,y;
      int z = 0;
      int a = 0;
      for (x = 0; x < 10; x++) { 
         System.out.print((x+1) + ". ");
         y = keyboard.nextInt();
         if (x == 0) { 
            z = y;   }
         if (y < z)  {
            z = y;   }
         a = a + y;
         } 
      a = a / x;
      System.out.println("The average is about: " + a);
      System.out.println("The minimum is: " + z);
   }
}
         