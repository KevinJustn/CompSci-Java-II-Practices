// This program is a small guessing game. When run, the program prompts the user to guess a color based on a number (1-5) ten times.
// At the end of 10 guesses, the program tells the user how many they guessed correctly.

import java.util.Scanner; 
import java.io.*; 
import java.util.Random;
public class ESP { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      int Guess;
      int Score = 0;
      System.out.println("Choose from colors: "); 
      System.out.println("(1)Red, (2)Green, (3)Blue, (4)Orange, and (5)Yellow");
      Random randomnumber = new Random();
      for (int x = 0; x < 10; x++) { 
      int Color = randomnumber.nextInt(5);
      if (Color == 0) { 
         Guess = Color + 1; 
         System.out.print("Guess the color number: "); 
         int User = keyboard.nextInt(); 
         if (User == Color + 1) {
            Score += 1; }
         System.out.println("The color was: " + Guess + ", Red");
         } 
      if (Color == 1) { 
         Guess = Color + 1; 
         System.out.print("Guess the color number: "); 
         int User = keyboard.nextInt(); 
         if (User == Color + 1) {
            Score += 1; }
         System.out.println("The color was: " + Guess + ", Green");
         } 
     if (Color == 2) { 
         Guess = Color + 1; 
         System.out.print("Guess the color number: "); 
         int User = keyboard.nextInt(); 
         if (User == Color + 1) {
            Score += 1; }
         System.out.println("The color was: " + Guess + ", Blue");
         } 
      if (Color == 3) { 
         Guess = Color + 1; 
         System.out.print("Guess the color number: "); 
         int User = keyboard.nextInt(); 
         if (User == Color + 1) {
            Score += 1; }
         System.out.println("The color was: " + Guess + ", Orange");
         } 
      if (Color == 4) { 
         Guess = Color + 1; 
         System.out.print("Guess the color number: "); 
         int User = keyboard.nextInt(); 
         if (User == Color + 1) {
            Score += 1; }
         System.out.println("The color was: " + Guess + ", Yellow");
         } 
      } 
      System.out.print("Your correctly guessed " + Score + "/10 colors.");  
   }
}
      