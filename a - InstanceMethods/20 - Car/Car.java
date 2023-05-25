// To run this program, run CarTesting.java.

public class Car { 
   private int yearModel;
   private String make;
   private int speed; 
   public Car(int y, String s, int m) { 
      yearModel = y;
      make = s;
      speed = m;
   }
   public String toString() { 
      return make+yearModel+" (now ... at speed of "+speed+")";
   }
   public int speednum() { 
      return speed;
   }
   public int accelerate() {
      speed = speed + 5;
      return speed;
   }
   public int brake() { 
      if (speed>=5) {
         speed = speed - 5; 
         return speed;
      }
      else {
         speed = speed - speed; 
         return speed;
   }  }
}