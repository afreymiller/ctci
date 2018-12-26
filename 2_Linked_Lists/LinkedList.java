
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

      System.out.println("i: " + Integer.toString(i));
      System.out.println("count: " + Integer.toString(count));

      while (count > 1) {
        deleteFirstValueOf(i);
        count--;
      }
    }
  }
} 