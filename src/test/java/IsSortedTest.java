import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.example.IsSorted.IsSorted;

public class IsSortedTest {
  @Test
  @Description("IsSortedTest")
  public void IsSortedTest() {
    int[] numbers_sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] numbers_unsorted = {0, 1, 2, 3, 4, 5, 6, 7, 9, 8};
    assert IsSorted(numbers_sorted);
    assert IsSorted(numbers_unsorted) == false;
  }
}
