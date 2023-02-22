package main.java.org.example;

public class SelectionSort {
  public static void SelectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int min = i;
      for (int j = i + 1; j < ary.length; j++) {
        if (ary[j] < ary[min]) {
          min = j;
        }
      }
      int temp = ary[i];
      ary[i] = ary[min];
      ary[min] = temp;
    }
  }
}
