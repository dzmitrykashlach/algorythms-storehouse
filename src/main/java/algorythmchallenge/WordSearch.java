package algorythmchallenge;

class WordSearch {

    // Rows and columns in the given grid
    private int rows, columns;


    // For searching in all 4 direction
    static int[] x = {-1, 0, 0, 1};
    static int[] y = {0, -1, 1, 0};


    public WordSearch(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }
    // searches in 4 directions, no dioganals

    boolean lookup(char[][] grid, int row,
                   int col, String word) {
        // stop in case if first char of word doesn't match given position
        if (grid[row][col] != word.charAt(0))
            return false;

        int len = word.length();

        // Search word in 4 directions
        for (int dir = 0; dir < 4; dir++) {
            // Initialize starting position for given direction
            int k, rd = row + x[dir], cd = col + y[dir];

            // First character is already checked,
            // check remaining letters
            for (k = 1; k < len; k++) {
                // break if out-of-bound
                if (rd >= rows || rd < 0 || cd >= columns || cd < 0)
                    break;

                // break if no match
                if (grid[rd][cd] != word.charAt(k))
                    break;

                // move further in this direction
                rd += x[dir];
                cd += y[dir];
            }

            // if all chars matched, k should be equal to lenth of word
            if (k == len)
                return true;
        }
        return false;
    }

    // Searches given word in a given
    // matrix in all 4 directions
    void wordSearch(
            char[][] grid,
            String word) {
        // Consider every point as starting and search given word
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (grid[row][col] == word.charAt(0) &&
                        lookup(grid, row, col, word))
                    System.out.println(
                            "Word is found at " + row + ", " + col);
            }
        }
    }

    public static void main(String args[]) {
        char[][] grid = {{'W', 'E', 'V', 'K', 'T', 'F', 'O', 'R', 'G', 'N', 'E', 'K', 'S'},
                {'G', 'Z', 'E', 'Y', 'R', 'A', 'N', 'G', 'E', 'R', 'E', 'Q', 'K'},
                {'R', 'E', 'G', 'N', 'S', 'D', 'O', 'N', 'G', 'E', 'R', 'V', 'G'}};
        WordSearch wordSearch = new WordSearch(grid.length, grid[0].length);
        wordSearch.wordSearch(grid, "DANGER");
    }
}