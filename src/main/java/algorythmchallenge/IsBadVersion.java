package algorythmchallenge;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.stream.IntStream;

@Setter
@Getter
public class IsBadVersion {
    public int bad = 0;
    public int firstBadVersion(int n) {
        int[] sortedSearchArray = IntStream.range(1, n).toArray();
        Arrays.stream(sortedSearchArray).forEach(i -> System.out.println(+i));
        int low = 1;
        while (low < n) {
            int mid = low + Math.round((n - low) / 2);
            boolean isMidBad = isBadVersion(mid,this.bad);
            if (isMidBad) {
                if (!isBadVersion(mid - 1,this.bad)) {
                    return mid;
                } else {
                    n = mid;
                }
            } else {
                low = mid;
            }
        }
        return -1;
    }

    public static boolean isBadVersion(int n,int bad) {
        return n >= bad;
    }

    public static void main(String[] args) {
        IsBadVersion isBadVersion = new IsBadVersion();
        isBadVersion.setBad(23);
        int res = isBadVersion.firstBadVersion(97);
        System.out.println("==========================================");
        System.out.println(res);
    }
}
