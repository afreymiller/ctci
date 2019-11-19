public class TestRunner {
  public static void main(String[] args) {
      
    ArraysAndStrings problems = new ArraysAndStrings();

    /* Has unique characters test suite */
    boolean outcome1 = problems.hasUniqueCharactersWithDataStructure("abcd");
    boolean outcome2 = problems.hasUniqueCharactersWithDataStructure("acc");

    System.out.println("outcome1: ");
    System.out.println(outcome1);

    System.out.println("outcome2: ");
    System.out.println(outcome2);

    boolean outcome3 = problems.hasUniqueCharactersNoDataStructure("abcd");
    boolean outcome4 = problems.hasUniqueCharactersNoDataStructure("aaa");

    System.out.println("outcome3: ");
    System.out.println(outcome3);

    System.out.println("outcome4: ");
    System.out.println(outcome4);

    Calculator c = new Calculator();



    /* Test cases */
    // boolean outcome1 = problems.isPermutation("car", "rac");
    // boolean outcome2 = problems.isPermutation("cbr", "rac");
    // boolean outcome3 = problems.isPermutation("ca", "rac");

    // boolean outcome1 = problems.hasUniqueCharacters("abv");

    System.out.println(problems.oneAway("dabc", "abc"));

  }
}