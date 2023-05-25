import java.util.Scanner; 
public class OddHollowTriangle { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter a number for R: ");
      int R = keyboard.nextInt(); 
      int g = R;
      int h = 1;
      int f;
      while (R > 0)
      {
      int r = R - 1; 
      for (;r > 0; r--)
         System.out.print(" ");
      System.out.print("$");
      if (g > R) {
         for (f = 0; f < h; f++)
            System.out.print(" ");
         h = h + 2;
         System.out.print("$"); }
      R = R - 1;
      System.out.println("");
      }
   }
}