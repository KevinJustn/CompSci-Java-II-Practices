// This program is based on the following requiremnets: 
// Write a class TestScores with TWO constructors. One is to accept three scores and save them in the private attribute(s). 
// The other is to accept an array with the length >=3 and store the first three elements in these attribute records. 
// Then, write necessary accessors and mutators to support the given class FinalGrading as shown in the below. 


public class FinalGrading{
public static void main(String args[]){
   TestScores a = new TestScores(75, 85, 95); 
   int [] t = {65, 70, 75};
   TestScores b = new TestScores(t);
   TestScores c = new TestScores(70, 85, 100);
   // a better solution is [] a = {
   //     new T...), new T...(t), new T...}
   int result = a.compareTo(b);
   System.out.println("a.compareTo(b) has the result:");
   System.out.println(a+".compareTo("+b+")="+result);
   System.out.println("because a's average of three scores is "
                     +a.getAvg());
   System.out.println("and b's average of three scores is "
                     +b.getAvg());
   System.out.println("");
   result = a.compareTo(c);
   System.out.println("a.compareTo(c) has the result:");
   System.out.println(a+".compareTo("+c+")="+result);
   System.out.println("because a's average of three scores is "
                     +a.getAvg());
   System.out.println("and c's average of three scores is "
                     +c.getAvg());
   System.out.println("");
   result = b.compareTo(c);
   System.out.println("b.compareTo(c) has the result:");
   System.out.println(b+".compareTo("+c+")="+result);
   System.out.println("because b's average of three scores is "
                     +b.getAvg());
   System.out.println("and c's average of three scores is "
                     +c.getAvg());
}
}