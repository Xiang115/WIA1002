package Lab.Lab11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 45, 7, 2, 8, 19, 3 };
        selectionSortSmallest(arr);
        System.out.println("Selection sort ascending: " + Arrays.toString(arr));

        arr = new int[] { 45, 7, 2, 8, 19, 3 };
        selectionSortLargest(arr);
        System.out.println("Selection sort descending: " + Arrays.toString(arr));

        arr = new int[] { 10, 34, 2, 56, 7, 67, 88, 42 };
        InsertionSort(arr);
        System.out.println("Insertion sort ascending: " + Arrays.toString(arr));
    }

    // Q1
    public static void selectionSortSmallest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int Small = arr[i];
            int SmallIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (Small > arr[j]) {
                    Small = arr[j];
                    SmallIndex = j;
                }
            }

            if (SmallIndex != i) {
                arr[SmallIndex] = arr[i];
                arr[i] = Small;
            }
        }
    }

    // Q2
    public static void selectionSortLargest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int Large = arr[i];
            int LargeIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (Large < arr[j]) {
                    Large = arr[j];
                    LargeIndex = j;
                }
            }

            if (LargeIndex != i) {
                arr[LargeIndex] = arr[i];
                arr[i] = Large;
            }
        }
    }

    // Q4
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int small = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > small; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = small;
        }
    }
}
