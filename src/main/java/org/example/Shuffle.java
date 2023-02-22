package org.example;

public class Shuffle {
  public static void Shuffle(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int j = (int) (Math.random() * (i + 1));
      int temp = ary[i];
      ary[i] = ary[j];
      ary[j] = temp;
    }
  }
}
