// This program asks the user to input rows and columns. Once entered, the program prints a table with numbers increasing in a down-and-over pattern. 

import java.util.Scanner; 
public class PrintGrid { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter the amount of rows: ");
      int R = keyboard.nextInt();
      System.out.print("Enter the amount of coloumns: ");
      int C = keyboard.nextInt(); 
      int cx = 1; 
      int c = 0;
      for (int n = 0; n < R; n++) { 
         for (; c < C; c++) 
         { 
            if (c < C-1) { 
               System.out.print(cx + ", ");
               cx = cx + R; } 
            if (c == C - 1) { 
               System.out.print(cx);
               cx = cx + R; } 
         }
         c = 0;
         cx = n + 2;
         System.out.println("");
      } 
   }
}
