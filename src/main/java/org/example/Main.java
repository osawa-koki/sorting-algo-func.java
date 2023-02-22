package org.example;

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
import static main.java.org.example.CombSort.CombSort;
import static main.java.org.example.CycleSort.CycleSort;
import static main.java.org.example.PancakeSort.PancakeSort;
import static main.java.org.example.GnomeSort.GnomeSort;
import static main.java.org.example.StoogeSort.StoogeSort;
import static main.java.org.example.PigeonholeSort.PigeonholeSort;
import static main.java.org.example.OddEvenSort.OddEvenSort;
import static main.java.org.example.CocktailSort.CocktailSort;
import static main.java.org.example.StarndSort.StarndSort;

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

    Shuffle(ary);
    Display("Shuffled", ary);

    CombSort(ary);
    Display("Comb Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    CycleSort(ary);
    Display("Cycle Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    PancakeSort(ary);
    Display("Pancake Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    GnomeSort(ary);
    Display("Gnome Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    StoogeSort(ary);
    Display("Stooge Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    PigeonholeSort(ary);
    Display("Pigeonhole Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    OddEvenSort(ary);
    Display("Odd-Even Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    CocktailSort(ary);
    Display("Cocktail Sort", ary);

    Shuffle(ary);
    Display("Shuffled", ary);

    StarndSort(ary);
    Display("Starnd Sort", ary);

  }
}
