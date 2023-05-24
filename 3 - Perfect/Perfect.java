// This program checks to see if an inputted number is perfect. 
// A number is "perfect" if it is equal to the sum of all of its factors (not including itself as a factor, but including 1 as a factor).  
// 6 is the first perfect number, because its factors are 1, 2, and 3, and 1+2+3 = 6.

import java.util.Scanner; 
public class Perfect { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter an integer: ");
      int N = keyboard.nextInt(); 
      int perfect = 0; 
      for (int x = 1; x <= N; x++){
         if (N%x == 0 && N != x)
            perfect = perfect + x; }
      if (perfect == N)
         System.out.print("Perfect: Yes");
      else
         System.out.print("Perfect: No");
   }
}