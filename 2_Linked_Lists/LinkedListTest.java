import java.util.HashMap;

public class LinkedListTest {
  public static void main(String [] args) {
    LinkedList ll = new LinkedList();
    // ll.traverseList();

    ll.appendToTail(4);
    ll.appendToTail(5);

    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
  }
}