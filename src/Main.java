/*
 * Main program to create a random array of 20 integers and sort them
 * using various sorting algorithms
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // create the array we will be sorting
        int[] array = createArray();
        // print the array
        System.out.println("Array before sorting: " + Arrays.toString(array));
        // sort the array using a insertion sort from main
        Sorter.insertionSort(array, array.length);
        // print the array
        System.out.println("Array after sorting: " + Arrays.toString(array));
        // create a second array to sort via selection sort
        int[] array2 = createArray();
        // print the array
        System.out.println("Array II before sorting: " + Arrays.toString(array2));
        // sort using selection sort
        Sorter.selectionSort(array2, array2.length);
        // print the array
        System.out.println("Array II after sorting: " + Arrays.toString(array2));
        // create a third array to sort via counting sort
        int[] array3 = createArray();
        // print the array
        System.out.println("Array III before sorting: " + Arrays.toString(array3));
        // sort using counting sort
        Sorter.countingSort(array3, array3.length);
        // print the array
        System.out.println("Array III after sorting: " + Arrays.toString(array3));

        /* outputs:
        Array before sorting: [3, 2, 8, 9, 4, 8, 5, 9, 6, 9, 9, 4, 9, 8, 2, 3, 7, 1, 3, 7]
        2 3 8 9 4 8 5 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 8 9 4 8 5 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 8 9 4 8 5 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 8 9 8 5 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 8 8 9 5 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 5 8 8 9 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 5 8 8 9 9 6 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 5 6 8 8 9 9 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 5 6 8 8 9 9 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 5 6 8 8 9 9 9 9 4 9 8 2 3 7 1 3 7
        2 3 4 4 5 6 8 8 9 9 9 9 9 8 2 3 7 1 3 7
        2 3 4 4 5 6 8 8 9 9 9 9 9 8 2 3 7 1 3 7
        2 3 4 4 5 6 8 8 8 9 9 9 9 9 2 3 7 1 3 7
        2 2 3 4 4 5 6 8 8 8 9 9 9 9 9 3 7 1 3 7
        2 2 3 3 4 4 5 6 8 8 8 9 9 9 9 9 7 1 3 7
        2 2 3 3 4 4 5 6 7 8 8 8 9 9 9 9 9 1 3 7
        1 2 2 3 3 4 4 5 6 7 8 8 8 9 9 9 9 9 3 7
        1 2 2 3 3 3 4 4 5 6 7 8 8 8 9 9 9 9 9 7
        1 2 2 3 3 3 4 4 5 6 7 7 8 8 8 9 9 9 9 9
        Array after sorting: [1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9]
        Array II before sorting: [1, 6, 7, 3, 5, 4, 6, 8, 4, 9, 6, 2, 9, 5, 7, 5, 3, 5, 4, 1]
        1 6 7 3 5 4 6 8 4 9 6 2 9 5 7 5 3 5 4 1
        1 1 7 3 5 4 6 8 4 9 6 2 9 5 7 5 3 5 4 6
        1 1 2 3 5 4 6 8 4 9 6 7 9 5 7 5 3 5 4 6
        1 1 2 3 5 4 6 8 4 9 6 7 9 5 7 5 3 5 4 6
        1 1 2 3 3 4 6 8 4 9 6 7 9 5 7 5 5 5 4 6
        1 1 2 3 3 4 6 8 4 9 6 7 9 5 7 5 5 5 4 6
        1 1 2 3 3 4 4 8 6 9 6 7 9 5 7 5 5 5 4 6
        1 1 2 3 3 4 4 4 6 9 6 7 9 5 7 5 5 5 8 6
        1 1 2 3 3 4 4 4 5 9 6 7 9 6 7 5 5 5 8 6
        1 1 2 3 3 4 4 4 5 5 6 7 9 6 7 9 5 5 8 6
        1 1 2 3 3 4 4 4 5 5 5 7 9 6 7 9 6 5 8 6
        1 1 2 3 3 4 4 4 5 5 5 5 9 6 7 9 6 7 8 6
        1 1 2 3 3 4 4 4 5 5 5 5 6 9 7 9 6 7 8 6
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 7 9 9 7 8 6
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 6 9 9 7 8 7
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 6 7 9 9 8 7
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 6 7 7 9 8 9
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 6 7 7 8 9 9
        1 1 2 3 3 4 4 4 5 5 5 5 6 6 6 7 7 8 9 9
        Array II after sorting: [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 9, 9]
        Array III before sorting: [7, 5, 5, 6, 9, 3, 9, 8, 0, 6, 7, 9, 7, 2, 0, 9, 6, 6, 1, 0]
        Array III after sorting: [0, 0, 0, 1, 2, 3, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 9, 9, 9, 9]
         */
    }

    /**
     * Creates an array of 20 random integers between 1 and 9
     * @return the array
     */
    public static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }
}