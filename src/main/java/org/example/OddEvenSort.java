package main.java.org.example;

public class OddEvenSort {
  public static void OddEvenSort(int[] ary) {
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 1; i < ary.length - 1; i += 2) {
        if (ary[i] > ary[i + 1]) {
          int temp = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = temp;
          sorted = false;
        }
      }
      for (int i = 0; i < ary.length - 1; i += 2) {
        if (ary[i] > ary[i + 1]) {
          int temp = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = temp;
          sorted = false;
        }
      }
    }
  }
}
