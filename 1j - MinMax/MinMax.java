// This program prompts the user to enter 25 integers and returns the minimum and maximum values.

import java.util.Scanner; 
import java.util.Arrays; 
public class MinMax { 
   public static void main(String[] args) { 
      int min = 0;
      int max = 0;
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter 25 Integers: ");
      int minmax[] = new int [25]; 
      for (int i = 0; i < minmax.length; i++) { 
         minmax[i] = keyboard.nextInt(); } 
      min = minmax[0];
      max = minmax[0];
      for (int e = 0; e < minmax.length; e++) { 
         if (minmax[e] < min) { 
            min = minmax[e];  }
         if (minmax[e] > max) { 
            max = minmax[e];  }
      }
      System.out.println("Minimum input: " + min); 
      System.out.println("Maximum input: " + max);
   }
}