package algorythmchallenge;

import java.util.Random;
// https://www.geeksforgeeks.org/find-number-of-islands/
public class NumberOfIslands {
    public int ROWS;
    public int COLS;

    public int numIslands(char[][] grid) {
        int countIslands = 0;
        for (int row = 0; row < grid.length; row++) {
            boolean visited[][] = new boolean[grid.length][grid[row].length];

            for (int col = 0; col < grid[row].length; col++) {
                visited[row][col] = true;
                if (isSafe(grid, row, col, visited)) {
                    DFS(grid, row, col, visited);
                    countIslands++;
                }
            }
        }
        return countIslands;
    }

    public void DFS(char grid[][], int row, int col, boolean visited[][]) {
        // These arrays are used to get row and column numbers
        // of 8 neighbors of a given cell
        int rowNbr[] = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

        // Mark this cell as visited
        visited[row][col] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k)
            if (isSafe(grid, row + rowNbr[k], col + colNbr[k], visited))
                DFS(grid, row + rowNbr[k], col + colNbr[k], visited);
    }

    boolean isSafe(char M[][], int row, int col,
                   boolean visited[][]) {
        return (row >= 0) && (row < this.ROWS) && (col >= 0) && (col < this.COLS) && (M[row][col] == 1 && !visited[row][col]);
    }

    public char[][] generateLandscape(int rows, int cols) {
        this.ROWS = rows;
        this.COLS = cols;
        char[][] grid = new char[rows][cols];
        Random random = new Random();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                boolean isLand = random.nextBoolean();
                grid[row][col] = isLand ? "1".charAt(0) : "0".charAt(0);
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = numberOfIslands.generateLandscape(5, 5);
        System.out.println("==================================================================");
        System.out.println(numberOfIslands.numIslands(grid));
    }
}
