// This program simulates a Slot Machine, where the user can input how much money they want to bet. 
// Then the program "rolls" the slots and notifies the users whether they win or lose anything. 
// The program will prompt the user if they want to play again or not, to which the user can respond with "Yes", "Y", "No", or "N" (not case sensitive). 

import java.util.Scanner; 
import java.io.*; 
import java.util.Random;
public class SlotM { 
   public static void main(String[] args) { 
      Scanner kb = new Scanner(System.in); 
      int MonIn = 0; 
      int MonOut = 0;
      int MonOut2 = 0;
      int Mon = 0;
      int Mult = 0; 
      int Slot;
      String Play = "Yes"; 
      while (Play.equalsIgnoreCase("yes") || Play.equalsIgnoreCase("y")) { 
      String Guess = "";
      Mult = 0;
      MonOut = 0;
      System.out.println("How much money will you put in ($)?");
      Mon = kb.nextInt();
      MonIn = MonIn + Mon;
      System.out.println("Choose from the following:");
      System.out.println("Cherries, Oranges, Plums, Melons, Bars");
      Guess = kb.next(); 
      String[] SlotsArray = {"Cherries","Oranges","Plums","Melons","Bars"};
      Random randnum = new Random();
      Slot = randnum.nextInt(5);
      String Slot1 = SlotsArray[Slot];
      Slot = randnum.nextInt(5);
      String Slot2 = SlotsArray[Slot];
      Slot = randnum.nextInt(5);
      String Slot3 = SlotsArray[Slot];
      System.out.println("");
      System.out.println(Slot1 + " " + Slot2 + " " + Slot3);
      if (Guess.equals(Slot1))
         Mult += 1;
      if (Guess.equals(Slot2))
         Mult += 1;
      if (Guess.equals(Slot3))
         Mult += 1;
      if (Mult == 2)
         MonOut = Mon * 2;
      if (Mult == 3)
         MonOut = Mon * 3;
      MonOut2 = MonOut2 + MonOut;
      System.out.println("You have won: $" + MonOut + "."); 
      System.out.println("");
      System.out.println("Would you like to play again?"); 
      Play = kb.next();
      System.out.println("");
      }
      System.out.println("Money in: $" + MonIn + ".");
      System.out.println("Money won: $" + MonOut2 + ".");
   }
}