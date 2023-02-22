package org.example;

public class CocktailSort {
  public static void CocktailSort(int[] ary) {
    boolean swapped = true;
    int start = 0;
    int end = ary.length;
    while (swapped == true) {
      swapped = false;
      for (int i = start; i < end - 1; ++i) {
        if (ary[i] > ary[i + 1]) {
          int temp = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = temp;
          swapped = true;
        }
      }
      if (swapped == false) {
        break;
      }
      swapped = false;
      end = end - 1;
      for (int i = end - 1; i >= start; i--) {
        if (ary[i] > ary[i + 1]) {
          int temp = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = temp;
          swapped = true;
        }
      }
      start = start + 1;
    }
  }
}
