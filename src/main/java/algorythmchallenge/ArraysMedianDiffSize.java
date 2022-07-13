package algorythmchallenge;
// A Java program to divide and conquer based
//https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m
// http://espressocode.top/median-two-sorted-arrays-different-sizes-ologminn-m/
// TODO, not done
public class ArraysMedianDiffSize {

    public double findMedianSortedArrays(int[] shortArray, int[] longArray) {
// find separating line;

        int min_index = 0, max_index = shortArray.length;
//      left index;
        int left_index;
//      right index;
        int right_index;
        int median, shortLength = shortArray.length, longLength = longArray.length;
        while (min_index < max_index) {
//            we're splitting short array for getting left index
            left_index = (min_index + max_index) / 2;
            //            we're splitting long array for getting right index
            right_index = ((shortLength + longLength + 1) / 2) - left_index;
//            //////////////////////////////////////////////////////
            if (
                    left_index < shortLength
                    && right_index > 0
//                    this condition is not working. При каком условии передвигается min_index ?
                    && longArray[right_index - 1] > shortArray[left_index]
            )
//                never reached line
                min_index = left_index + 1;
            ///////////////////////////////////////////////////
        }
        //  split short array (min_index + max_index) / 2 и вставьте ее в переменную i
//  split long array используйте формулу (n + m + 1) / 2 — i и вставьте ее в переменную j
        return 0.0;
    }

    // Driver code
    public static void main(String[] args) {
        int[] shortArray = new int[]{3, 14, 65};
        int[] longArray = new int[]{0, 2, 6, 8, 23, 78};
        ArraysMedianDiffSize arraysMedianDiffSize = new ArraysMedianDiffSize();
        arraysMedianDiffSize.findMedianSortedArrays(shortArray, longArray);
    }
}
