package main.java.org.example;

public class CombSort {
  public static void CombSort(int[] ary) {
    int n = ary.length;
    int gap = n;
    boolean swapped = true;
    while (gap != 1 || swapped == true) {
      gap = getNextGap(gap);
      swapped = false;
      for (int i = 0; i < n - gap; i++) {
        if (ary[i] > ary[i + gap]) {
          int temp = ary[i];
          ary[i] = ary[i + gap];
          ary[i + gap] = temp;
          swapped = true;
        }
      }
    }
  }

  private static int getNextGap(int gap) {
    gap = (gap * 10) / 13;
    if (gap < 1) {
      return 1;
    }
    return gap;
  }
}
