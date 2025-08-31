// Last updated: 31/08/2025, 15:48:59
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if (value == '.') {
                    continue;
                }
                if (rows[i].contains(value) || cols[j].contains(value)
                        || squares[(i / 3) * 3 + (j / 3)].contains(value)) {
                    return false;
                }
                rows[i].add(value);
                cols[j].add(value);
                squares[(i / 3) * 3 + (j / 3)].add(value);
            }
        }

        return true;

    }
}