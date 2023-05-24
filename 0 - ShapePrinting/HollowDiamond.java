import java.util.Scanner; 
public class HollowDiamond { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter a number for R: "); 
      int R = keyboard.nextInt(); 
      int r,g,h;
      for (r = 1; r < R*2; r++)
         System.out.print("$");
      System.out.println("");
      for (r = 1; r <= R; r++){
         for (g = R - r; g >= 1; g--)
            System.out.print("$");
         if (r < R) {
            for (h = 1; h <= 2*r-1; h++)
               System.out.print(" "); }
         for (g = R - r; g >= 1; g--)
            System.out.print("$");
         if (r < R)
            System.out.println("");    }
            
      for (r = R - 2; r >= 1; r--){
         for (g = 1; g <= R - r; g++)
            System.out.print("$");
         for (h = 1; h <= 2*r-1; h++)
            System.out.print(" ");
         for (g = 1; g <= R - r; g++)
            System.out.print("$");
         System.out.println("");    }
      for (r = 1; r < R*2; r++)
         System.out.print("$");
   }
}