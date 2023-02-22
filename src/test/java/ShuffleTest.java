
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.example.Shuffle.Shuffle;

public class ShuffleTest {
  @Test
  @Description("ShuffleTest")
  public void ShuffleTest() {
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] numbers_original = Arrays.copyOf(numbers, numbers.length);
    Shuffle(numbers);
    boolean is_ok = false;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != numbers_original[i]) {
        is_ok = true;
      }
    }
    assert is_ok;
  }
}
