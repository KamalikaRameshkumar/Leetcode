// Last updated: 7/17/2026, 3:01:09 PM
class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, 0);

        return result;
    }

    private void solve(char[][] board, int row) {

        if (row == board.length) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board,
                           int row,
                           int col) {

        int r, c;

        // Check column
        for (r = 0; r < row; r++) {
            if (board[r][col] == 'Q')
                return false;
        }

        // Check left diagonal
        for (r = row - 1, c = col - 1;
             r >= 0 && c >= 0;
             r--, c--) {

            if (board[r][c] == 'Q')
                return false;
        }

        // Check right diagonal
        for (r = row - 1, c = col + 1;
             r >= 0 && c < board.length;
             r--, c++) {

            if (board[r][c] == 'Q')
                return false;
        }

        return true;
    }

    private List<String> construct(char[][] board) {

        List<String> solution = new ArrayList<>();

        for (char[] row : board) {
            solution.add(new String(row));
        }

        return solution;
    }
}