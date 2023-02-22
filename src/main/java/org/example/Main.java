package main.java.org.example;

import static main.java.org.example.Display.Display;
import static main.java.org.example.Shuffle.Shuffle;
import static main.java.org.example.BubbleSort.BubbleSort;
import static main.java.org.example.SelectionSort.SelectionSort;

public class Main {
  public static void main(String[] args) {

    int[] ary = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    Display("Original", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    BubbleSort(ary);
    Display("Bubble Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    SelectionSort(ary);
    Display("Selection Sort", ary);

  }
}
