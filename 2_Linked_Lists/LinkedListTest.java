
public class LinkedListTest {
  public static void main(String [] args) {
    LinkedList ll = new LinkedList();
    // ll.traverseList();

    ll.appendToTail(4);
    ll.appendToTail(5);

    //ll.traverseList();

    // ll.deleteNode(3);

    ll.deleteNodesOfValue(1);

    ll.deleteNodesOfValue(4);

    ll.deleteNodesOfValue(5);

    ll.deleteNodesOfValue(2);

    ll.traverseList();

    //System.out.println(ll.head.data);

    //n1.removeDuplicates(n1);

    // n1.traverseList(n1);
  }
}