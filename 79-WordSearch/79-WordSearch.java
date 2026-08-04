// Last updated: 8/4/2026, 9:22:03 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int rows = board.length;
4        int cols = board[0].length;
5        for (int i = 0; i < rows; i++) {
6            for (int j = 0; j < cols; j++) {
7                if (dfs(board, word, i, j, 0)) {
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14    private boolean dfs(char[][] board, String word,
15                         int row, int col, int index) {
16        if (index == word.length()) {
17            return true;
18        }
19        if (row < 0 || row >= board.length ||
20            col < 0 || col >= board[0].length ||
21            board[row][col] != word.charAt(index)) {
22            return false;
23        }
24        char temp = board[row][col];
25        board[row][col] = '#';
26        boolean found =
27            dfs(board, word, row + 1, col, index + 1) ||
28            dfs(board, word, row - 1, col, index + 1) ||
29            dfs(board, word, row, col + 1, index + 1) ||
30            dfs(board, word, row, col - 1, index + 1);
31        board[row][col] = temp;
32        return found;
33    }
34}