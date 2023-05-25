// To run this program, run FinalGrading.java.

public class TestScores { 
   private int scoreA; 
   private int scoreB;
   private int scoreC;
   public TestScores(int a, int b, int c) { 
      scoreA = a;
      scoreB = b;
      scoreC = c;
   }
   public TestScores(int t[]){
      scoreA = t[0];
      scoreB = t[1];
      scoreC = t[2];
   }
   public float getAvg() { 
      int Sum = scoreA + scoreB + scoreC;
      int Avg = Sum/3;
      return Avg;
   }
   public String toString(){ 
      return ""+getAvg();
   }
   public int compareTo(TestScores x){ 
      if (this.getAvg() > x.getAvg()){ 
         return 1;
      }
      if (this.getAvg() < x.getAvg()){ 
         return -1;
      }
      else 
         return 0;
   }
}