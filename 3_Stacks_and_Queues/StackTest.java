public class StackTest {
  public static void main(String [] args) {
    MyStack s = new MyStack();
    
    s.push(5);

    int i = s.pop();

    System.out.println(i);

  }
}