import java.util.*;
public class Main {

    public static void main(String[] args) {
        // System.out.println("Array Sorter!"); IDE generated code
        // create the array we will be sorting
        int[] array = createArray();
        // print the array
        System.out.println("Array before sorting: " + Arrays.toString(array));
        // sort the array using a insertion sort from main
       // Main.insertionSort(array); currently not working


    }

    /**
     * Creates an array of 20 random integers
     * @return the array
     */
    public static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }
    /**
     * Prints the array
     * @param array the array to print
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // SELECTION SORT
    /** Sorts the first n objects in an array into ascending order.
     @param a  An array of Comparable objects.
     @param n  An integer > 0. */
    public static void selectionSort(int[] a, int n)
    {
        for (int index = 0; index < n - 1; index++)
        {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
            // Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
        } // end for
    } // end selectionSort

    // Finds the index of the smallest value in a portion of an array a.
    // Precondition: a.length > last >= first >= 0.
    // Returns the index of the smallest value among
    // a[first], a[first + 1], . . . , a[last].
    private static int getIndexOfSmallest(int[] a, int first, int last)
    {
        int min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++)
        {
            if (a[index] < 0)
            {
                min = a[index];
                indexOfMin = index;
            } // end if
            // Assertion: min is the smallest of a[first] through a[index].
        } // end for

        return indexOfMin;
    } // end getIndexOfSmallest

// -------------------------------------------------------------------------------

    // INSERTION SORT
    public static void insertionSort(int[] a, int n)
    {
        insertionSort(a, 0, n - 1);
    } // end insertionSort

    public static void insertionSort(int[] a, int first, int last)
    {
        for (int unsorted = first + 1; unsorted <= last; unsorted++)
        {   // Assertion: a[first] <= a[first + 1] <= ... <= a[unsorted - 1]

            int firstUnsorted = a[unsorted];

            insertInOrder(firstUnsorted, a, first, unsorted - 1);
        } // end for
    } // end insertionSort

    private static void insertInOrder(int anEntry, int[] a, int begin, int end)
    {
        int index = end;

        while ((index >= begin) && (a[index]) < 0)
        {
            a[index + 1] = a[index]; // Make room
            index--;
        } // end for

        // Assertion: a[index + 1] is available
        a[index + 1] = anEntry;  // Insert
    } // end insertInOrder

    // -------------------------------------------------------------------------------
    // Swaps the array entries a[i] and a[j].
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } // end swap

}