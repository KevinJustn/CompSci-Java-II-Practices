// To run this program, run Registra.java.

public class Person { 
   private String name;
   private int age;
   public Person(String n, int a) {
      name = n;
      age = a;
   }
   public String toString() { 
      return "N("+name+"), A("+age+").";
   }
   public String Name(){ 
      return name;
   }
   public boolean has_same_name(Person b) { 
      return name.equals(b.Name());
   }
   public int Age(){ 
      return age;
   }
   public boolean has_same_age(Person b) { 
      return age == b.Age();
   }
   public boolean is_younger_than(Person b) { 
      return age < b.Age();
   }
   public boolean is_older_than(Person b) { 
      return age > b.Age();
   }
}