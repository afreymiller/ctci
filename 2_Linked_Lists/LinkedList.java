
import java.util.HashMap;
import java.util.*;

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

  void deleteFirstValueOf(int d) {
    Node n = head;

    if (n.data == d) {
      n = n.next;
    }

    Node copyOfHead = n;

    while (n.next != null) {
      if (n.next.data == d) {
        if (n.next.next != null) {
          n.next = n.next.next;
          break;
        } else {
          n.next = null;
          break;
        }
      }
      n = n.next;
    }

    head = copyOfHead;
  }

  /* 2.1 */
  void removeDuplicates() {
    Node n = head;

    HashMap<Integer, Integer> valFrequencies = new HashMap<Integer, Integer>();

    while (n != null) {

      if (valFrequencies.containsKey(n.data)) {
        int count = valFrequencies.get(n.data);
        count++;
        valFrequencies.put(n.data, count);
      } else {
        valFrequencies.put(n.data, 1);
      }

      n = n.next;
    }

    List<Integer> l = new ArrayList<Integer>(valFrequencies.keySet());

    for (int i : l) {
      // accessing each element of array
      int count = valFrequencies.get(i);

      while (count > 1) {
        deleteFirstValueOf(i);
        count--;
      }
    }
  }

  /* 2.1 - alternate ending */
  void removeDuplicatesNoBuffer () {
    Node curr = head;

    while (curr != null) {
      Node runner = curr;

      while (runner.next != null) {
        if (runner.next.data == curr.data) {
          runner.next = runner.next.next; 
        } else {
          runner = runner.next;
        }
      }

      curr = curr.next;
    }
  }

  /* 2.2 kth to last */
  int printKthToLast (Node hd, int k) {
    if (hd == null) {
      return 0;
    }

    int index = printKthToLast(hd.next, k) + 1;

    if (index == k) {
      System.out.println(Integer.toString(k) + "th to last node is " + Integer.toString(hd.data));
    }
    
    return index;
  }
} 