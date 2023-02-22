package main.java.org.example;

public class StarndSort {
  public static void StarndSort(int[] ary) {
    int n = ary.length;
    for (int i = 0; i < n - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        if (ary[j] < ary[min_idx]) {
          min_idx = j;
        }
      }
      int temp = ary[min_idx];
      ary[min_idx] = ary[i];
      ary[i] = temp;
    }
  }
}
