import java.util.*;
class LinkedListDemo{
  public static void main(String args[]){
    LinkedList<String> 11 = new LinkedList<String>();
    11.add("F");
    11.add("B");
    11.add("D");
    11.add("E");
    11.add("C");
    11.addLast("Z");
    11.addFirst("A");
    11.add(1,"A2");
    System.out.println("Original contents of 11: " + 11);
    11.remove("F");
    11.remove(2);
    System.out.println("Contents of 11 after deletion: " + 11);
    11.removeFirst();
    11.removeLast();
    System.out.println("11 after deleting first and last: " + 11);
    String val = 11.get(2);
    11.set(2, val + "Changed");
    System.out.println("11 after change: " + 11);
  }
}
