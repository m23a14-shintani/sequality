package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testsum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  public void testto() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.to(1, 10));
  }

  public void testodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd(1, 10));
  }

  public void testeven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even(1, 10));
  }

  public void testcntto() {
    Calculate calculate = new Calculate();
    int expected = 10;
    assertEquals(expected, calculate.tocount(1, 10));
  }

}
