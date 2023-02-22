import jdk.jfr.Description;

import org.example.*;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class SortingAlgoTest {
  @Test
  @Description("SortingAlgoTest")
  void SortingAlgoTest() {

    // Java has weak type inference, so it is necessary to prepare intermediate variables.
    Consumer<int[]> bubbleSort = BubbleSort::BubbleSort;
    Consumer<int[]> selectionSort = SelectionSort::SelectionSort;
    Consumer<int[]> insertionSort = InsertionSort::InsertionSort;
    Consumer<int[]> mergeSort = MergeSort::MergeSort;
    Consumer<int[]> quickSort = QuickSort::QuickSort;
    Consumer<int[]> heapSort = HeapSort::HeapSort;
    Consumer<int[]> shellSort = ShellSort::ShellSort;
    Consumer<int[]> countingSort = CountingSort::CountingSort;
    Consumer<int[]> bucketSort = BucketSort::BucketSort;
    Consumer<int[]> combSort = CombSort::CombSort;
    Consumer<int[]> cycleSort = CycleSort::CycleSort;
    Consumer<int[]> pancakeSort = PancakeSort::PancakeSort;
    Consumer<int[]> gnomeSort = GnomeSort::GnomeSort;
    Consumer<int[]> stoogeSort = StoogeSort::StoogeSort;
    Consumer<int[]> pigeonholeSort = PigeonholeSort::PigeonholeSort;
    Consumer<int[]> oddEvenSort = OddEvenSort::OddEvenSort;
    Consumer<int[]> cocktailSort = CocktailSort::CocktailSort;
    Consumer<int[]> starndSort = StarndSort::StarndSort;

    Consumer<int[]>[] sortAlgos = new Consumer[] {
      bubbleSort,
      selectionSort,
      insertionSort,
      mergeSort,
      quickSort,
      heapSort,
      shellSort,
      countingSort,
      bucketSort,
      combSort,
      cycleSort,
      pancakeSort,
      gnomeSort,
      stoogeSort,
      pigeonholeSort,
      oddEvenSort,
      cocktailSort,
      starndSort
    };

    int[] ary = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    for (Consumer<int[]> sortAlgo : sortAlgos) {
      Shuffle.Shuffle(ary);
      sortAlgo.accept(ary);
      if (ary[0] != 0 || ary[ary.length - 1] != 9) {
        throw new RuntimeException("SortingAlgoTest failed");
      }
    }

  }
}
