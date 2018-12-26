public class StackTest {
  public static void main(String[] args) {
    Stack theStack = new Stack(10); 
    theStack.push(10);
    theStack.push(20);
    theStack.push(30);
    theStack.push(40);
    theStack.push(50);
      
    while (!theStack.isEmpty()) {
      int value = theStack.pop();
      System.out.print(value);
      System.out.print(" ");
    }

    System.out.println("");
  }
}