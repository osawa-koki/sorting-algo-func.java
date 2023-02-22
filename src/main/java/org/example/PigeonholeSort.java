package org.example;

public class PigeonholeSort {
  public static void PigeonholeSort(int[] ary) {
    int min = ary[0];
    int max = ary[0];
    int range, i, j, index;
    for (int a = 0; a < ary.length; a++) {
      if (ary[a] > max) {
        max = ary[a];
      }
      if (ary[a] < min) {
        min = ary[a];
      }
    }
    range = max - min + 1;
    int[] phole = new int[range];
    for (i = 0; i < ary.length; i++) {
      phole[ary[i] - min]++;
    }
    index = 0;
    for (j = 0; j < range; j++) {
      while (phole[j]-- > 0) {
        ary[index++] = j + min;
      }
    }
  }
}
