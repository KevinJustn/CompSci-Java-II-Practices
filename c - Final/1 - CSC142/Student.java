// TO run this program, run CSC142.java.

public class Student implements Comparable{
   private String name;
   private int grade[];
   // no more any other attribute.
   
   public Student (String n, int [] g){
      name = n;
      grade = new int [g.length];
      for(int i = 0; i< g.length; i++)
         grade[i] = g[i];
   }
   
   // Your development will go here.
   public double get_average(){ 
      double Avg = 0;
      double x = grade.length; 
      for (int i=0;i<x;i++){ 
         Avg += grade[i];
      }
      Avg = Avg/x;
      return Avg;
   }
   
   public String get_name(){ 
      return name;
   }
   
   public String toString(){ 
      String letter = ""; 
      if (get_average() >= 90 && get_average() <= 100)
         letter = "A"; 
      if (get_average() < 90 && get_average() >= 80)
         letter = "B";
      if (get_average() < 80 && get_average() >= 65)
         letter = "C"; 
      if (get_average() < 65 && get_average() >= 60)
         letter = "D";
      if (get_average() < 60 && get_average() >= 0)
         letter = "F"; 
      return letter;
   }
   
   public int compareTo(Object S){ 
      Student R = (Student) S;
      double a = this.get_average();
      double b = R.get_average();
      if (a > b) 
         return 1; 
      if (a < b) 
         return -1;
      else
         return 0;
   }
} // end of class Student