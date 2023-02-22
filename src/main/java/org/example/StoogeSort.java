package main.java.org.example;

public class StoogeSort {
  public static void StoogeSort(int[] ary) {
    StoogeSort(ary, 0, ary.length - 1);
  }

  private static void StoogeSort(int[] ary, int l, int h) {
    if (l >= h) {
      return;
    }
    if (ary[l] > ary[h]) {
      int t = ary[l];
      ary[l] = ary[h];
      ary[h] = t;
    }
    if (h - l + 1 > 2) {
      int t = (h - l + 1) / 3;
      StoogeSort(ary, l, h - t);
      StoogeSort(ary, l + t, h);
      StoogeSort(ary, l, h - t);
    }
  }
}
