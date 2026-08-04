// Last updated: 8/4/2026, 9:47:37 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n = triangle.size();
4        int[] dp = new int[n];
5        for (int i = 0; i < n; i++) {
6            dp[i] = triangle.get(n - 1).get(i);
7        }
8        for (int i = n - 2; i >= 0; i--) {
9            for (int j = 0; j <= i; j++) {
10                dp[j] = triangle.get(i).get(j)
11                       + Math.min(dp[j], dp[j + 1]);
12            }
13        }
14        return dp[0];
15    }
16}