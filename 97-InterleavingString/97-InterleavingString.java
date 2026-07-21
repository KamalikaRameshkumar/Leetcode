// Last updated: 7/21/2026, 9:36:23 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        int m = s1.length();
5        int n = s2.length();
6
7        if (m + n != s3.length()) {
8            return false;
9        }
10
11        boolean[][] dp = new boolean[m + 1][n + 1];
12        dp[0][0] = true;
13
14        for (int i = 0; i <= m; i++) {
15            for (int j = 0; j <= n; j++) {
16
17                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
18                    dp[i][j] |= dp[i - 1][j];
19                }
20
21                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
22                    dp[i][j] |= dp[i][j - 1];
23                }
24            }
25        }
26
27        return dp[m][n];
28    }
29}