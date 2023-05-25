// To run this program, run TimeCheck.java.

public class Time { 
   private int hour;
   private int minute;
   public Time() { 
      hour = 0;
      minute = 0;
   }
   public boolean isValid(int h, int m) {
      hour = h;
      minute = m;
      int approve = 0;
      if ((hour>=0 && hour<12) && (minute>=0 && minute<60)) { 
         return true;
      }
      else { 
         return false;
   }  }
   public void setTime(int h, int m, boolean isAm) {
      hour = h;
      minute = m; 
      if (isAm == false) { 
         hour = hour + 12;
   }  }
   public String toString(){ 
      return "("+hour+","+minute+")";
   }
   public int getHour() {
      return hour;
   }
   public int getMinute() { 
      return minute;
   }
   public int compareTo(Time t){ 
      int TimeDiff = this.getHour()*60 + this.getMinute() - t.getHour()*60 - t.getMinute();
      if (TimeDiff > 0){ 
         return 1;
      }
      if (TimeDiff < 0){ 
         return -1;
      }
      else
         return 0;
   }
}