/*
    Sorter class where I borrowed various sorting methods from ArraySorter and
    changed their data type to accept int type arrays
    ALso has the added method to print the array
 */
public class Sorter {
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
            printArray(a);
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
            if (a[index] < min)
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
            printArray(a);
        } // end for
    } // end insertionSort

    private static void insertInOrder(int anEntry, int[] a, int begin, int end)
    {
        int index = end;

        while ((index >= begin) && (anEntry < a[index]))
        {
            a[index + 1] = a[index]; // Make room
            index--;
        } // end for

        // Assertion: a[index + 1] is available
        a[index + 1] = anEntry;  // Insert
    } // end insertInOrder

// -------------------------------------------------------------------------------

    // COUNTING SORT

    /**
     * Sorts the array using counting sort
     * @param a the array to sort
     * @param n the size of the array
     */
    public static void countingSort(int[] a, int n)
    {
        int[] temp = new int[n];
        int[] count = new int[20];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i < 20; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            temp[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
    }

// -------------------------------------------------------------------------------

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } // end swap

    //method to print the array during each step of the sort
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
