// Last updated: 7/21/2026, 9:56:38 AM
1class Solution {
2
3    int count = 0;
4
5    public int totalNQueens(int n) {
6
7        boolean[] cols = new boolean[n];
8        boolean[] diag1 = new boolean[2 * n];
9        boolean[] diag2 = new boolean[2 * n];
10
11        backtrack(0, n, cols, diag1, diag2);
12
13        return count;
14    }
15
16    private void backtrack(int row, int n, boolean[] cols,
17                           boolean[] diag1, boolean[] diag2) {
18
19        if (row == n) {
20            count++;
21            return;
22        }
23
24        for (int col = 0; col < n; col++) {
25
26            if (cols[col] || diag1[row + col] || diag2[row - col + n]) {
27                continue;
28            }
29
30            cols[col] = true;
31            diag1[row + col] = true;
32            diag2[row - col + n] = true;
33
34            backtrack(row + 1, n, cols, diag1, diag2);
35
36            cols[col] = false;
37            diag1[row + col] = false;
38            diag2[row - col + n] = false;
39        }
40    }
41}