public class MyArray { 
   private int[] head;
   public MyArray() { 
      head = null;
   }
   public String toString(){
      String headS = "[";
      if (size()==1) { 
         headS +=head[0]+"]";
         return headS;}
      if (size()>1) { 
         for(int i=0;i<size();i++){
            headS+= head[i];
            if (i+1!=size()){
               headS+=",";}}
         headS +="]";
         return headS;}
      else
         return null;
   }
   public int size(){ 
      int count = 0;
      if (head == null){ 
         count = 0;
      }
      else { 
         for (int i:head){
            count += 1;}
      }
      return count;
   }
   public void remove(){ 
      if (head != null){
      int[] headr = new int[size()-1];
      for (int i=1;i<size();i++){
         headr[i-1] = head[i];
         }
      head = headr;}
   }
   public String element(int y){
      if (head == null){ 
         return null; }
      else {
      return ""+head[y]; } 
   }
   public boolean add(int m, int n){ 
      if (head == null && m == 0){
         int [] headnew = new int[1];
         headnew[m] = n;
         head = headnew;
         return true; }
      if (size()>0 && m<=size()){
         int [] headnew = new int[size()+1];
         for (int i=0;i<size();i++){
            if (m==0){
               headnew[i+1] = head[i];}
            else 
               headnew[i] = head[i];}
         headnew[m] = n;
         head = headnew;
         return true; }
      else
         return false;   
   }
   public void set(int o, int p){ 
      if (size()>0)
         head[o] = p;
   }
   public int indexOf(int q) {
      int place = -1;
      if (head == null){
         return place;}
      if (size()>0){
         for (int i=0;i<size()-1;i++) {
            if (head[i] == q){
               place = i; } }
            if (place != -1){
               return place; }
            else 
               return place; }
      else
         return place;
   }
   public void clear(){
      head = null;
   }
   
   public void add(int k){
      int[] headad = new int[size()+1];
      for (int i=0;i<size();i++){
         headad[i] = head[i];}
      headad[size()] = k;
      head = headad;
   }
}