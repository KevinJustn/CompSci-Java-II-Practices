import java.util.Scanner; 
public class OddTriangle { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter a number for R: ");
      int R = keyboard.nextInt(); 
      int g = R;
      int h = R;
      while (R > 0)
      {
      int r = R - 1; 
      for (;r > 0; r--)
         System.out.print(" ");
      System.out.print("$");
      if (g > R)
         while (g > R)
         {
         System.out.print("$$");
         g = g - 1;
         }
      g = h;
      R = R - 1;
      System.out.println("");
      }
   }
}