// To run this program, run TimeCheck.java.

public class Time implements Comparable {
private int hour =0;
private int minute =0;
public Time (int h, int m){
 if (h<0||h>23) return;
 if(m<0||m>59) return;
 hour = h;
 minute = m;
}
//The above cannot be changed!
// Your work starts from here ...
   public int getHour(){
      return hour;
   }
   public int getMinute(){
      return minute;
   }
   
   public int compareTo(Object t){
      if (t != null){ 
         Time T = (Time) t;
         int t1 = hour*60 + minute;
         int t2 = T.getHour()*60 + T.getMinute();
         if (t1>t2){
            return 1;
         }
         if (t1<t2){
            return -1;
         }
         else 
            return 0;
      }
      else
         return 0;
   }
   
   public String toString(){
      return "("+hour+", "+minute+")";
   }
}