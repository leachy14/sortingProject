import java.util.*;
public class Main {

    public static void main(String[] args) {
        // System.out.println("Array Sorter!"); IDE generated code
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


    }

    /**
     * Creates an array of 20 random Integer values
     * @return the array
     */
    public static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }
}