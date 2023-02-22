package org.example;

public class GnomeSort {
  public static void GnomeSort(int[] ary) {
    int i = 1;
    int j = 2;
    while (i < ary.length) {
      if (ary[i - 1] <= ary[i]) {
        i = j;
        j++;
      } else {
        int temp = ary[i - 1];
        ary[i - 1] = ary[i];
        ary[i] = temp;
        i--;
        if (i == 0) {
          i = j;
          j++;
        }
      }
    }
  }
}
