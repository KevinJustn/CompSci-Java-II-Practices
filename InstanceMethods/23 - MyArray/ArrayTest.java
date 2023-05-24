// This program is based on the following requirements: 
// Write the class MyArray with a private array attribute “private int [] head” and use this attribute only to support the given class ArrayTest without throwing any exception.
// The methods include: 
// "add( )” to accept an integer as the argument and insert this value at the end of the current array “head.” The method should also support the insertion when the head is null."
// “toString” to print out all elements as desired, without any unnecessary delimiter “,”.
// “remove( )” that remove the first element in the array head. The method should also support the deletion when the head is null or contains one element only.
// “element( )” that accepts an integer index and returns the index’th element in the array “head,” in the format of String.
// Overloading method “add” that accepts two integers as the argument. The first indicates the position of the new record inserted into array “head” and the second one indicates the value. The method should avoid any exception when the index becomes out of the appropriate range in according to the head/array length.
// “set” that accepts two integers as the argument. The first indicates the position of the array “head” and the second one indicates the target value for the update.
// “indexOf” that accepts an integer value as the argument. The method must return the location of the first appearance of this value in the array “head.” If not found, return -1. Be aware of the situation when head becomes null.
// “size( )” that returns the size of array “head.”
// “clear” that reset the array “head” null.

public class ArrayTest{
public static void main(String args[]){
   MyArray a = new MyArray();
   MyArray b = a;
   System.out.println(a);
   a.remove(); // Should not incur any exception.
   System.out.println("Size:"+a.size());
   System.out.println("[0]:"+a.element(0));
   System.out.println("add(1, 1):"+a.add(1,1));
   System.out.println("set [0] by 1.");
   a.set(0,1); // No exception even there is no element.
   System.out.println(a);
   System.out.println(a.indexOf(1));
   System.out.println("add(0, 1):"+a.add(0,1));
   System.out.println("[0]:"+a.element(0));
   System.out.println(a);
   System.out.println(a.size());
   a.clear();
   System.out.println(a);
   a.add(1);
   System.out.println("add(2,2):"+a.add(2, 2));
   System.out.println("add(1,3):"+a.add(1, 3));
   System.out.println("add(0,4):"+a.add(0, 4));
   a.add(5);
   System.out.println(a);
   System.out.println("indexOf(4):"+a.indexOf(4));
   a.remove();
   System.out.println("indexOf(4):"+a.indexOf(4));
   System.out.println(b); // Not a!
   System.out.println("[size-1]:"+b.element(b.size()-1));   
  }
}