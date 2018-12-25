public class Calculator {

    public int add(int x, int y) {
      return x + y;
    }

    public int multiply(int x, int y) {
      int i;
      int product = 0;

      for (i = 0; i < x; i++) {
        product = add(product, y);
      }

      return product;
    }

    public int subtract(int x, int y) {
      return add(x, -y);
    }
}