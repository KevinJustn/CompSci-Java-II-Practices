// This program prompts the user to enter a text file name (two are provided here).
// The program will then read the first five lines (or less) of the inputted file.

import java.util.Scanner; 
import java.io.*;
public class FiveOnly { 
   public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter the name of a file: ");
      String FName = keyboard.nextLine(); 
      File file = new File(FName); 
      Scanner inputFile = new Scanner(file); 
      int x = 0;
      while (inputFile.hasNext() && x < 5){
      String line = inputFile.nextLine();
      System.out.println(line);
      x += 1;
      }
      inputFile.close();
      
   }
}