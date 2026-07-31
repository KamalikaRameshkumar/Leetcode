// Last updated: 7/31/2026, 10:08:17 AM
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int m = dungeon.length;
4        int n = dungeon[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
9
10        for (int i = m - 2; i >= 0; i--) {
11            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - dungeon[i][n - 1]);
12        }
13
14        for (int j = n - 2; j >= 0; j--) {
15            dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - dungeon[m - 1][j]);
16        }
17
18        for (int i = m - 2; i >= 0; i--) {
19            for (int j = n - 2; j >= 0; j--) {
20                int need = Math.min(dp[i + 1][j], dp[i][j + 1]);
21                dp[i][j] = Math.max(1, need - dungeon[i][j]);
22            }
23        }
24
25        return dp[0][0];
26    }
27}