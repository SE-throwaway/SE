import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  private static final Set<Integer> first100Primes = new HashSet<>(
      List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
          61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131,
          137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
          211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
          283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373,
          379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457,
          461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541));

  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    for (var prime : first100Primes) {
      assertTrue(prime + " is prime!", PrimeCheck.isPrime(prime));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("this will fail", true, false);
  }
}
