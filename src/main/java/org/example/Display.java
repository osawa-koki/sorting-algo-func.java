package main.java.org.example;

public class Display {
  public static void Display(String title, int[] ary) {
    System.out.println(String.format("%-20s", title) + ": " + String.join(" ", java.util.Arrays.stream(ary).mapToObj(String::valueOf).toArray(String[]::new)));
  }
}
