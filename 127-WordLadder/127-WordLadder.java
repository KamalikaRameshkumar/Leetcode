// Last updated: 7/21/2026, 10:34:27 AM
1class Solution {
2
3    public int minCut(String s) {
4        int n = s.length();
5
6        boolean[][] palindrome = new boolean[n][n];
7        int[] dp = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            dp[i] = i; // Maximum cuts
11
12            for (int j = 0; j <= i; j++) {
13
14                if (s.charAt(i) == s.charAt(j) &&
15                        (i - j <= 2 || palindrome[j + 1][i - 1])) {
16
17                    palindrome[j][i] = true;
18
19                    if (j == 0)
20                        dp[i] = 0;
21                    else
22                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
23                }
24            }
25        }
26
27        return dp[n - 1];
28    }
29}