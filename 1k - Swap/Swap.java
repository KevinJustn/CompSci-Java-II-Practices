// This program takes 25 inputs and swaps the locations of the minimum and maximum values. 

import java.util.Scanner; 
import java.util.Arrays; 
public class Swap { 
   public static void main(String[] args) { 
      int min = 0;
      int max = 0;
      int minin = 0;
      int maxin = 0;
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter 25 Integers: ");
      int myArray[] = new int [25]; 
      for (int i = 0; i < myArray.length; i++) { 
         myArray[i] = keyboard.nextInt(); } 
      min = myArray[0];
      max = myArray[0];
      for (int e = 0; e < myArray.length; e++) { 
         if (myArray[e] < min) { 
            min = myArray[e];
            minin = e; }
         if (myArray[e] > max) { 
            max = myArray[e];
            maxin = e;  }
      }
      myArray[minin] = max;
      myArray[maxin] = min;
      System.out.println(Arrays.toString(myArray));
   }
}