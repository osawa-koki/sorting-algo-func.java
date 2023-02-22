package main.java.org.example;

public class PancakeSort {
  public static void PancakeSort(int[] ary) {
    for (int currSize = ary.length; currSize > 1; --currSize) {
      int mi = findMax(ary, currSize);
      if (mi != currSize - 1) {
        flip(ary, mi);
        flip(ary, currSize - 1);
      }
    }
  }

  private static int findMax(int[] ary, int n) {
    int mi, i;
    for (mi = 0, i = 0; i < n; ++i) {
      if (ary[i] > ary[mi]) {
        mi = i;
      }
    }
    return mi;
  }

  private static void flip(int[] ary, int i) {
    int temp, start = 0;
    while (start < i) {
      temp = ary[start];
      ary[start] = ary[i];
      ary[i] = temp;
      start++;
      i--;
    }
  }
}
