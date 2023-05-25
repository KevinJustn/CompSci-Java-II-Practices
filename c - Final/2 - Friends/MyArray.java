// To run this program, run Friends.java.

public abstract class MyArray implements StringArrayInterface {
private String [] head;

public MyArray(){
   head = null;
}
public MyArray(String [] str){
   if (str==null) {
      head = null; // or head = str;
      return;
   }
   head = new String [str.length]; // deep copy is needed.
   for(int i = 0; i<str.length; i++)
      head[i] = str[i];
}

public int size(){
   if(head==null||head.length==0)
      return 0;
   else
      return head.length;
}

public abstract String toString();

// Your development will go here.
   public void add(String S){ 
      if (head == null){ 
         String [] headx = {S}; 
         head = headx;
      }
      else { 
         String [] headx = new String [head.length+1];
         for (int i=0;i<head.length;i++){
            headx[i] = head[i];
         }
         headx[headx.length-1] = S;
         head = headx;
      }
   }
   
   public String get(int x){ 
      if (head == null || x >= head.length)
         return null;
      else 
         return head[x];
   }
}   