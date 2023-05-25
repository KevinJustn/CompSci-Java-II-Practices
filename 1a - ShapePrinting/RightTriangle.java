import java.util.Scanner;
public class RightTriangle {
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a number for R: ");
      int R = keyboard.nextInt();
      while (R > 0)
      {
      int r = R;
      for (;r > 0;r--) 
         System.out.print("$");
      R = R - 1;
      System.out.println("");
      }
   }
}
