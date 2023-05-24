// This program prompts the user to enter a positive integer. If a negative integer is entered, the program prompts the user to enter another number
// The inputted positive number is then added together.

import java.util.Scanner; 
public class Sum { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter a positive integer: ");
      int n = keyboard.nextInt(); 
      while (n <= 0) {
      System.out.print("Invalid input, please try again: ");
      n = keyboard.nextInt();
      }
      int sum = 0; 
      while (n > 0) { 
      sum += n % 10;
      n = n / 10; 
      } 
      System.out.print(sum);
   }
}