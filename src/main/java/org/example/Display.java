package main.java.org.example;

import static main.java.org.example.IsSorted.IsSorted;

public class Display {
  public static void Display(String title, int[] ary) {
    String isSorted = IsSorted(ary) ? "\u001B[34m" + "true " + "\u001B[0m" : "\u001B[31m" + "false" + "\u001B[0m";
    System.out.println(String.format(
      "%s (%s) : %s",
      String.format("%-20s", title),
      (isSorted),
      String.join(" ", java.util.Arrays.stream(ary).mapToObj(String::valueOf).toArray(String[]::new))
    ));
  }
}
