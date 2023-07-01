package sequality;

public class Calculate {

  public int sum(int x, int y) {
    return x + y;
  }

  public int to(int x, int y) {
    int sum = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int odd(int x, int y) {
    int sum = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 == 0) {

      } else {
        sum += i;
      }
    }
    return sum;
  }

  public int even(int x, int y) {
    int sum = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum += i;
      } else {

      }
    }
    return sum;
  }

  public int sumcount(int x, int y) {
    return 2;
  }

  public int tocount(int x, int y) {
    int count = 0;
    int i = 0;
    for (i = x; i <= y; i++) {
      count++;
    }
    return count;
  }

  public double ave(int x, int count) {
    return ((double) x / (double) count);
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
