package main.java.org.example;

public class ShellSort {
  public static void ShellSort(int[] ary) {
    int n = ary.length;
    for (int gap = n / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i++) {
        int temp = ary[i];
        int j;
        for (j = i; j >= gap && ary[j - gap] > temp; j -= gap) {
          ary[j] = ary[j - gap];
        }
        ary[j] = temp;
      }
    }
  }
}
