package org.example;

public class InsertionSort {
  public static void InsertionSort(int[] ary) {
    for (int i = 1; i < ary.length; i++) {
      int j = i;
      while (j > 0 && ary[j] < ary[j - 1]) {
        int temp = ary[j];
        ary[j] = ary[j - 1];
        ary[j - 1] = temp;
        j--;
      }
    }
  }
}
