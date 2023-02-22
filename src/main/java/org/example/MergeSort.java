package main.java.org.example;

public class MergeSort {
  public static void MergeSort(int[] ary) {
    int[] temp = new int[ary.length];
    MergeSort(ary, temp, 0, ary.length - 1);
  }

  private static void MergeSort(int[] ary, int[] temp, int left, int right) {
    if (left < right) {
      int center = (left + right) / 2;
      MergeSort(ary, temp, left, center);
      MergeSort(ary, temp, center + 1, right);
      Merge(ary, temp, left, center + 1, right);
    }
  }

  private static void Merge(int[] ary, int[] temp, int left, int right, int rightEnd) {
    int leftEnd = right - 1;
    int k = left;
    int num = rightEnd - left + 1;

    while (left <= leftEnd && right <= rightEnd) {
      if (ary[left] <= ary[right]) {
        temp[k++] = ary[left++];
      } else {
        temp[k++] = ary[right++];
      }
    }

    while (left <= leftEnd) {
      temp[k++] = ary[left++];
    }

    while (right <= rightEnd) {
      temp[k++] = ary[right++];
    }

    for (int i = 0; i < num; i++, rightEnd--) {
      ary[rightEnd] = temp[rightEnd];
    }
  }
}
