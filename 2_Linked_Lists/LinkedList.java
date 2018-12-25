
public class LinkedList {
  public static void main(String [] args) {
    Node n1 = new Node(1);
    n1.appendToTail(2);
    n1.appendToTail(3);

    System.out.println(n1.next.data);
  }
} 