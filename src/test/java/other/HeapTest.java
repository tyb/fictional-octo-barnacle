package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HeapTest {

  @Test
  void heapSort_null() {
    int[] nullArray = null;
    Heap.heapSort(nullArray);
    assertNull(nullArray);
  }

  @Test
  void heapSort_empty() {
    int[] emptyArray = {};
    Heap.heapSort(emptyArray);
    assertArrayEquals(new int[]{}, emptyArray);
  }

  @Test
  void heapSort_singleElement() {
    int[] singleElementArray = {77};
    Heap.heapSort(singleElementArray);
    assertArrayEquals(new int[]{77}, singleElementArray);
  }

  @Test
  void heapSort_multipleElements() {
    int[] multipleElementsArray = {247, 46, 197, 75, 127, 42, 238, 10, 127, 176};
    Heap.heapSort(multipleElementsArray);
    assertArrayEquals(new int[]{10, 42, 46, 75, 127, 127, 176, 197, 238, 247}, multipleElementsArray);
  }

  @Test
  void heapSort_5LevelsHeap() {
    int[] multipleElementsArray = {231, 51, 84, 202, 182, 103, 97, 32, 2, 192, 279, 143, 106, 176, 51, 159, 65, 182,
        224, 116};
    Heap.heapSort(multipleElementsArray);
    assertArrayEquals(new int[]{2, 32, 51, 51, 65, 84, 97, 103, 106, 116, 143, 159, 176, 182, 182, 192, 202, 224, 231,
        279}, multipleElementsArray);
  }


  @Test
  void heapSort_alreadySorted() {
    int[] alreadySortedArray = {49, 105, 112, 141, 152, 163, 192, 207, 243, 246};
    Heap.heapSort(alreadySortedArray);
    assertArrayEquals(new int[]{49, 105, 112, 141, 152, 163, 192, 207, 243, 246}, alreadySortedArray);
  }

  @Test
  void heapSort_reverseSorted() {
    int[] reverseSortedArray = {186, 176, 169, 140, 114, 85, 72, 71, 53, 20};
    Heap.heapSort(reverseSortedArray);
    assertArrayEquals(new int[]{20, 53, 71, 72, 85, 114, 140, 169, 176, 186}, reverseSortedArray);
  }

  @Test
  void heapSort_boundaryLow() {
    int[] arrayWithLowBoundary = {66, 1};
    Heap.heapSort(arrayWithLowBoundary);
    assertArrayEquals(new int[]{1, 66}, arrayWithLowBoundary);
  }

  @Test
  void heapSort_boundaryHigh() {
    int[] arrayWithLowBoundary = {255, 55};
    Heap.heapSort(arrayWithLowBoundary);
    assertArrayEquals(new int[]{55, 255}, arrayWithLowBoundary);
  }
}