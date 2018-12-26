
public class LinkedList {

  Node head = null;

  public LinkedList () {
    this.head = new Node(1);
    Node n1 = new Node(2);
    Node n2 = new Node(3);

    this.head.next = n1;
    n1.next = n2;
  }

  void traverseList() {
    Node n = head;
    while (n.next != null) {
      System.out.println(n.data);
      n = n.next;
    }

    /* Print out the value for the very last one */
    System.out.println(n.data);
  }

  void appendToTail (int d) {
    Node end = new Node(d);
    Node n = head;
    while (n.next != null) {
      n = n.next;
    }
    
    n.next = end;
  }

  void deleteNodesOfValue(int d) {
    Node n = head;

    if (n.data == d) {
      n = n.next;
    }

    Node copyOfHead = n;

    while (n.next != null) {
      if (n.next.data == d) {
        if (n.next.next != null) {
          n.next = n.next.next;
        } else {
          n.next = null;
          break;
        }
      }
      n = n.next;
    }

    head = copyOfHead;
  }

  Node removeDuplicates(Node head) {
    Node n = head;
    int [] values = new int[10];

    while (head.next != null) {
      if (values[head.data] == 0) {
        n.next = head.next;
        head = head.next;
      } else {
        head = head.next;
      }
    }

    traverseList();

    return n;
  }
} 