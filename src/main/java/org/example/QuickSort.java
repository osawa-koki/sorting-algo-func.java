package org.example;

public class QuickSort {
  public static void QuickSort(int[] ary) {
    QuickSort(ary, 0, ary.length - 1);
  }

  private static void QuickSort(int[] ary, int left, int right) {
    if (left < right) {
      int pivot = Partition(ary, left, right);
      QuickSort(ary, left, pivot - 1);
      QuickSort(ary, pivot + 1, right);
    }
  }

  private static int Partition(int[] ary, int left, int right) {
    int pivot = ary[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
      if (ary[j] <= pivot) {
        i++;
        Swap(ary, i, j);
      }
    }
    Swap(ary, i + 1, right);
    return i + 1;
  }

  private static void Swap(int[] ary, int i, int j) {
    int temp = ary[i];
    ary[i] = ary[j];
    ary[j] = temp;
  }
}
