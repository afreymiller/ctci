
public class LinkedListTest {
  public static void main(String [] args) {
    LinkedList ll = new LinkedList();

    ll.appendToTail(4);
    ll.appendToTail(5);
    ll.appendToTail(3);
    ll.appendToTail(4);

    ll.removeDuplicatesNoBuffer();

    ll.traverseList();

    ll.printKthToLast(ll.head, 2);
  }
}