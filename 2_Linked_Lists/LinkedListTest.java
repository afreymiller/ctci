
public class LinkedListTest {
  public static void main(String [] args) {
    LinkedList ll = new LinkedList();

    ll.appendToTail(4);
    ll.appendToTail(5);

    ll.deleteMiddleNode(ll.head.next.next);

    ll.traverseList();
  }
}