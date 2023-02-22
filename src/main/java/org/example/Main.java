package main.java.org.example;

import static main.java.org.example.Display.Display;
import static main.java.org.example.Shuffle.Shuffle;
import static main.java.org.example.BubbleSort.BubbleSort;
import static main.java.org.example.SelectionSort.SelectionSort;
import static main.java.org.example.InsertionSort.InsertionSort;
import static main.java.org.example.MergeSort.MergeSort;
import static main.java.org.example.QuickSort.QuickSort;
import static main.java.org.example.HeapSort.HeapSort;
import static main.java.org.example.ShellSort.ShellSort;
import static main.java.org.example.CountingSort.CountingSort;
import static main.java.org.example.BucketSort.BucketSort;

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

    Shuffle(ary);
    Display("Shuffled", ary);

    InsertionSort(ary);
    Display("Insertion Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    MergeSort(ary);
    Display("Merge Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    QuickSort(ary);
    Display("Quick Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    HeapSort(ary);
    Display("Heap Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    ShellSort(ary);
    Display("Shell Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    CountingSort(ary);
    Display("Counting Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    BucketSort(ary);
    Display("Bucket Sort", ary);

  }
}
