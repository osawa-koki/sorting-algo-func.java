package org.example;

public class BubbleSort {
  public static void BubbleSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      for (int j = 0; j < ary.length - 1; j++) {
        if (ary[j] > ary[j + 1]) {
          int temp = ary[j];
          ary[j] = ary[j + 1];
          ary[j + 1] = temp;
        }
      }
    }
  }
}
