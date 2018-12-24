public class TestRunner {
  public static void main(String[] args) {
      
    ArraysAndStrings problems = new ArraysAndStrings();

    // Prints "Hello, World" to the terminal window.
    System.out.println("Hello, World");

    boolean outcome = problems.isPermutation("hllo", "world");

    System.out.println(outcome);

    // isPermutation("hello", "world");
  }
}