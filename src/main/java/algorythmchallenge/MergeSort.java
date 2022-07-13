package algorythmchallenge;

import java.util.Arrays;

//https://www.baeldung.com/java-merge-sort
// Used for sorting linked lists in O(nLogn) time;
/* Java program for Merge Sort */
public class MergeSort {

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
//        When we reach the end of one of the sub-arrays, the rest of the elements from the other array
//        are copied into the input array, thereby giving us the final sorted array:
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 4, 13, 6, 1, 7};

        System.out.println("Given Array");
        Arrays.stream(arr).forEach(a -> System.out.print(a+" "));

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, arr.length);

        System.out.println("\nSorted array");
        Arrays.stream(arr).forEach(a -> System.out.print(a+" "));
    }
}