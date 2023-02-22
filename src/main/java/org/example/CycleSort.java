package org.example;

public class CycleSort {
  public static void CycleSort(int[] ary) {
    int n = ary.length;
    for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
      int item = ary[cycleStart];
      int pos = cycleStart;
      for (int i = cycleStart + 1; i < n; i++) {
        if (ary[i] < item) {
          pos++;
        }
      }
      if (pos == cycleStart) {
        continue;
      }
      while (item == ary[pos]) {
        pos++;
      }
      if (pos != cycleStart) {
        int temp = item;
        item = ary[pos];
        ary[pos] = temp;
      }
      while (pos != cycleStart) {
        pos = cycleStart;
        for (int i = cycleStart + 1; i < n; i++) {
          if (ary[i] < item) {
            pos++;
          }
        }
        while (item == ary[pos]) {
          pos++;
        }
        if (item != ary[pos]) {
          int temp = item;
          item = ary[pos];
          ary[pos] = temp;
        }
      }
    }
  }
}
