package org.example;

public class CountingSort {
  public static void CountingSort(int[] ary) {
    int n = ary.length;
    int[] output = new int[n];
    int[] count = new int[256];
    for (int i = 0; i < 256; i++) {
      count[i] = 0;
    }
    for (int i = 0; i < n; i++) {
      count[ary[i]]++;
    }
    for (int i = 1; i <= 255; i++) {
      count[i] += count[i - 1];
    }
    for (int i = n - 1; i >= 0; i--) {
      output[count[ary[i]] - 1] = ary[i];
      count[ary[i]]--;
    }
    for (int i = 0; i < n; i++) {
      ary[i] = output[i];
    }
  }
}
