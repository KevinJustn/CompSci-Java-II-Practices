// This project required students to write five methods based on the following requirements: 
// a.	Write a method that takes an integer X as an argument, and returns true if X is even, and false if X is odd.
// b.	Write a method that takes an integer N as an argument, and displays a square of NxN stars
// c.	Write a method that takes an integer N as an argument, and returns true if N is prime, and false otherwise.
// d.	Write a method that reads an int array W as argument. The method will return an array so that its last element in array W will be removed at its tail from the callers’ view. 
// e.	Write a method that reads a String W as argument. The method will return a String so that its last character in String W will be removed at its tail from the callers’ view. 

import java.util.*; 
public class Method { 
   public static void main(String[] args) { 
      System.out.println("result of isEven(3):"+isEven(3)); 
      displaySquare(3);
      System.out.println("result of isPrime(5):"+isPrime(5)); 
      int [] a ={1,2,3};
      int [] b ={};
      int [] c ={1};
      int [] d = null;
      System.out.println(Arrays.toString(md(a)));
      System.out.println(Arrays.toString(md(b)));
      System.out.println(Arrays.toString(md(c)));
      System.out.println(Arrays.toString(md(d)));
      String e = "abc";
      String f = "a";
      String g = "";
      String h = null;
      System.out.println(me(e));
      System.out.println(me(f));
      System.out.println(me(g));
      System.out.println(me(h));
      } 
      // end of main


      // develop your (5) methods here:
      public static boolean isEven(int X) { 
      if (X%2 == 0) { 
         return true; }
      else {
         return false; }}
         
      public static void displaySquare(int N) { 
      for (int x=0; x<N; x++) { 
         for (int y=0; y<N; y++) { 
            System.out.print("*");}
         System.out.println(); }} 
         
      public static boolean isPrime(int N) { 
      int Pri = 0;
      for (int z=1; z<=N; z++) { 
         if (N%z == 0) { 
            Pri += 1; }}
      if (Pri > 2){ 
         return false; } 
      else { 
         return true; }}
      
      public static int [] md(int[] W) { 
      if (W == null || W.length<=1) { 
         return null; } 
      int L = W.length-1;
      int[] arr = new int[L];
      for (int i=0; i<L; i++) { 
         arr[i] = W[i]; } 
      return arr; }
      
      public static String me(String W) { 
      if (W == null || W.length()<=1) { 
         return null; } 
      int K = W.length()-1;
      String str = W.substring(0,K);
      return str; }
      
      }
