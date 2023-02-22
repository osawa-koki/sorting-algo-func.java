package org.example;

public class IsSorted {
  public static boolean IsSorted(int[] ary) {
    for (int i = 1; i < ary.length; i++) {
      if (ary[i] < ary[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
