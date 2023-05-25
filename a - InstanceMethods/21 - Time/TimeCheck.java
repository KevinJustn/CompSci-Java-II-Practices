// This program runs based on the following requirements:
// The hour value ranges from 0 to 23, where the range 0 to 11 represents a time before noon. The minute value ranges from 0 to 59.
// A constructor or initialization to initiate the time (of the new object) to 0 hour and 0 minute.
// A method “isValid( )” where a call “isValid(hour, minute)” returns true if the given hour and minute values are in the appropriate range. 
// A method “setTime( )” where a call “setTime(hour, minute, isAm)” will set the time attributes. The call will accept the hour from 0 to 11 but will use a 24 hour clock when isAm is false.
// A method “compareTo( )” to compare two time object and decide which time is earlier, same, or later by its return values -1, 0, and 1 respectively. If needed, develop necessary accessors.

import java.util.Scanner;

public class TimeCheck{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   Time [] t = {new Time(), new Time(), new Time()};
   for(int i = 0; i<t.length; i++){
      int hour, minute;
      do{
         System.out.print("Input hour for set t"+i+":");
         hour = kb.nextInt();
         System.out.print("Input minute for set t"+i+":");
         minute = kb.nextInt();
      }while(!t[i].isValid(hour, minute));
      t[i].setTime(hour, minute, true);        
   }
   System.out.println("--- after initialization ---");
   for(int i = 0; i<t.length; i++)
      System.out.println(t[i]);  
   int r = t[1].compareTo(t[0]);
   System.out.println("The result of t[1].compareTo(t[0])"+r);
   
   t[1].setTime(t[1].getHour(), t[1].getMinute(), false);
   System.out.println("--- after resetting ---");
   for(int i = 0; i<t.length; i++)
      System.out.println(t[i]);    
   r = t[1].compareTo(t[0]);
   System.out.println("The result of t[1].compareTo(t[0])"+r);
   }
}