public class TestRunner {

  public static void main(String[] args) {
      
    
    ArraysAndStrings problems = new ArraysAndStrings();

    /* Has unique characters test suite */
    boolean outcome1 = problems.hasUniqueCharactersWithDataStructure("abcd");
    boolean outcome2 = problems.hasUniqueCharactersWithDataStructure("acc");
    boolean outcome3 = problems.hasUniqueCharactersNoDataStructure("abcd");
    boolean outcome4 = problems.hasUniqueCharactersNoDataStructure("aaa");

    assert outcome1 == true;
    assert outcome2 == false;
    assert outcome3 == true;
    assert outcome4 == false;

    /* String a is permutation of b test suite */
    boolean outcome5 = problems.isPermutation("car", "rac");
    boolean outcome6 = problems.isPermutation("cbr", "rac");
    boolean outcome7 = problems.isPermutation("ca", "rac");

    assert outcome5 == true;
    assert outcome6 == false;
    assert outcome7 == false;
  }
}