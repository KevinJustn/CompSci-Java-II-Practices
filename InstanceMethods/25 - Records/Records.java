public class Records extends Student{
private int [] test = null;
private int [] quiz = null;
private int [] assignment = null;

public Records (String name, int tn, int qn, int an, int tw, int qw, int aw){
   super(name, tw, qw, aw);
   test = new int [tn];
   quiz = new int [qn];
   assignment = new int [an];
}
// The above is fixed and cannot be changed!
// They are used to support lines 8-13 in TimeCheck.java.

// Your work starts from here ...
   public void set_test(int [] x){
      if (x.length != test.length)
         return;
      for (int i=0; i<test.length; i++) {
         test[i] = x[i];
      }
   }
   
   public void set_quiz(int [] x){
      if (x.length != quiz.length)
         return;
      for (int i=0; i<quiz.length; i++) { 
         quiz[i] = x[i];
      }
   }
   
   public void set_assignment(int [] x){
      if (x.length != assignment.length)
         return;
      for (int i=0; i<assignment.length; i++) {
         assignment[i] = x[i];
      }
   }
   
   public double get_test(){ 
      double total = 0.0;
      if (test.length<=0){ 
         return 0.0;
      }
      for (int i=0; i<test.length; i++)
         total += test[i];
      return total/test.length;
   }
   
   public double get_quiz(){ 
      double total = 0.0;
      if (quiz.length<=0){ 
         return 0.0;
      }
      for (int i=0; i<quiz.length; i++)
         total += quiz[i];
      return total/quiz.length;
   }
   
   public double get_assignment(){
      double total = 0.0;
      if (assignment.length<=0){ 
         return 0.0;
      }
      for (int i=0; i<assignment.length; i++)
         total += assignment[i];
      return total/assignment.length;
   }
   
   public void grading(){ 
      double [] gpa = {get_test(), get_quiz(), get_assignment()};
      letter_grading(gpa);
   }
   
   public String toString(){
      String score = "";
      score += get_name() + "\n";
      if (test.length>0) { 
         score += "Test score:[";
         for (int i=0;i<test.length; i++){
            score += test[i];
            if (i<test.length-1)
               score +=",";
         }
         score += "]"+"\n"; 
      }
      if (quiz.length>0){
         score += "Quiz score:[";
         for (int i=0;i<quiz.length; i++){
            score += quiz[i];
            if (i<quiz.length-1)
               score +=",";
         }
         score += "]"+"\n";
      }
      if (assignment.length>0){
         score += "Assignment score:[";
         for (int i=0;i<assignment.length; i++){
            score += assignment[i];
            if (i<assignment.length-1)
               score +=",";
         }
         score += "]"+"\n";
      }
      grading();
      score += "GPA: "+get_gpa()+"\n";
      return score;
   }
         
}