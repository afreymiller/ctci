public class TestRunner {
  public static void main(String[] args) {
      
    ArraysAndStrings problems = new ArraysAndStrings();

    Calculator c = new Calculator();



    /* Test cases */
    // boolean outcome1 = problems.isPermutation("car", "rac");
    // boolean outcome2 = problems.isPermutation("cbr", "rac");
    // boolean outcome3 = problems.isPermutation("ca", "rac");

    // boolean outcome1 = problems.hasUniqueCharacters("abv");

    System.out.println(problems.oneAway("dabc", "abc"));

  }
}