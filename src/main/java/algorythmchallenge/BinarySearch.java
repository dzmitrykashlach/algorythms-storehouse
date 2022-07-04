package algorythmchallenge;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int[] sortedSearchArray = Arrays.stream(nums).sorted().toArray();
        Arrays.stream(sortedSearchArray).forEach(i->System.out.println(+i));
        int low = 0;
        int high = sortedSearchArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = sortedSearchArray[mid];
            if (guess == target) {
                return mid;
            }
            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 8, 2, 5, 99, 1, 23, 52, 11, 6, 8, 9, 23, 8};
        int res = search(nums, 23);
        System.out.println("==========================================");
        System.out.println(res);
    }
}
