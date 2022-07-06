package algorythmchallenge;

import java.util.Arrays;

// https://www.geeksforgeeks.org/trapping-rain-water/
public class TrappingRainWater {

    private int levelCount = 1;
    private int maxHeight = 1;
    private int waterCount = 0;

    public TrappingRainWater(int[] trap) {
        this.maxHeight = Arrays.stream(trap).max().getAsInt();
    }

    public static void main(String[] args) {
//        int[] trap = new int[]{0, 2, 0, 2, 0, 1, 1, 0, 1, 0, 1};
        int[] trap = new int[]{0, 2, 0, 2};
        TrappingRainWater trappingRainWater = new TrappingRainWater(trap);
        System.out.println("==================================================");
        System.out.println(trappingRainWater.trap(trap));
    }

//    check if we are not going behind int[0] to the left;
    private int checkLeftBound(int i) {
        return (Math.max((i - 1), 0));
    }

    private int iterateGap(int[] trap, int start, int levelCount) {
        int levelWaterCount = 1;
        // we are moving horisontally to the right border in order to count water on the current level
        while (trap[start] < trap[start + levelWaterCount-1]) {
            levelWaterCount++;
            if ((start + levelCount) < trap.length - 1) {
                break;
            }
        }
        // we are adding water from this level to overall water counter;
        waterCount = waterCount + levelWaterCount;
//========================= DEBUG ==========================================================================
        int leftBorder = trap[checkLeftBound(start)];
        // we are checking if upper level if more wide then current using lef border;
        while (trap[start] < trap[checkLeftBound(leftBorder)]) {
            leftBorder--;
        }
        //
        while (levelCount < maxHeight) {
            levelCount++;
            waterCount = waterCount + iterateGap(trap, leftBorder, levelCount);
        }
        return waterCount;
    }

    private int trap(int[] trap) {
        int globalWaterCount = 0;
        for (int i = 1; i < trap.length - 1; i++) {
//            check if left neighbour are bigger, look for next right neighbour which is bigger;
            if (trap[i] < trap[i - 1]) {
                globalWaterCount = globalWaterCount + iterateGap(trap, i, 0);
            }
        }
        return globalWaterCount;
    }

}
