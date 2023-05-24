// This program calculates the time duration between two inputted times (separated into hours and minutes). 

import java.util.Scanner;
import java.io.*; 
public class Duration { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
      int EHour = -2;
      int SHour = -1;
      int SMinute = 0;
      int EMinute = 0;
      int error = 0;
      while (EHour < SHour){
         System.out.print("Enter the start hour (0-23): ");
         SHour = keyboard.nextInt();  
         System.out.print("Enter the start minute (0-59): ");
         SMinute = keyboard.nextInt();
         System.out.print("Enter the end hour (0-23): ");
         EHour = keyboard.nextInt();
         System.out.print("Enter the end minute (0-59): ");
         EMinute = keyboard.nextInt();
         if ((EHour < SHour) || ((SHour < 0) || (SHour > 23)) || ((EHour < 0) || (EHour > 23)) || ((SMinute < 0) || (SMinute > 59)) || ((EMinute < 0) || (EMinute > 59)))
            error += 1;
      if (error > 0){
         System.out.println("Error: There was an issue with an input(s).");
         System.out.println("Would you like to renter the times?");
         System.out.print("Enter 1 (Yes) or 0 (No): "); 
      int X = keyboard.nextInt();
      if (X == 1){ 
            EHour = -2;
            SHour = -1;}
      else{
            System.exit(0);}}
      }
      int DHour = EHour - SHour; 
      int DMinute = EMinute - SMinute; 
      if (DMinute < 0){ 
         DHour = DHour - 1;
         DMinute = DMinute + 60;}
      System.out.print("The time duration is: " + DHour + ":" + DMinute);
   }
}