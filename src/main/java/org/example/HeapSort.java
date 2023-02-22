package main.java.org.example;

public class HeapSort {
  public static void HeapSort(int[] ary) {
    int n = ary.length;
    for (int i = n / 2 - 1; i >= 0; i--) {
      Heapify(ary, n, i);
    }
    for (int i = n - 1; i >= 0; i--) {
      int temp = ary[0];
      ary[0] = ary[i];
      ary[i] = temp;
      Heapify(ary, i, 0);
    }
  }

  private static void Heapify(int[] ary, int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && ary[left] > ary[largest]) {
      largest = left;
    }
    if (right < n && ary[right] > ary[largest]) {
      largest = right;
    }
    if (largest != i) {
      int swap = ary[i];
      ary[i] = ary[largest];
      ary[largest] = swap;
      Heapify(ary, n, largest);
    }
  }
}
