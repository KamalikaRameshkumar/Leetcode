// Last updated: 7/31/2026, 10:11:15 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4
5        if (n == 0 || k == 0) {
6            return 0;
7        }
8
9        if (k >= n / 2) {
10            int profit = 0;
11            for (int i = 1; i < n; i++) {
12                if (prices[i] > prices[i - 1]) {
13                    profit += prices[i] - prices[i - 1];
14                }
15            }
16            return profit;
17        }
18
19        int[][] dp = new int[k + 1][n];
20
21        for (int t = 1; t <= k; t++) {
22            int maxDiff = -prices[0];
23            for (int i = 1; i < n; i++) {
24                dp[t][i] = Math.max(dp[t][i - 1], prices[i] + maxDiff);
25                maxDiff = Math.max(maxDiff, dp[t - 1][i] - prices[i]);
26            }
27        }
28
29        return dp[k][n - 1];
30    }
31}