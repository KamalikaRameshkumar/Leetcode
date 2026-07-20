// Last updated: 7/20/2026, 7:16:21 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[0][0] = grid[0][0];
9
10        for (int i = 1; i < m; i++) {
11            dp[i][0] = dp[i - 1][0] + grid[i][0];
12        }
13
14        for (int j = 1; j < n; j++) {
15            dp[0][j] = dp[0][j - 1] + grid[0][j];
16        }
17
18        for (int i = 1; i < m; i++) {
19            for (int j = 1; j < n; j++) {
20                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
21            }
22        }
23
24        return dp[m - 1][n - 1];
25    }
26}