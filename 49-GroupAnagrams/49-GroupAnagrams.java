// Last updated: 7/22/2026, 3:20:19 PM
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4
5        if (s.charAt(0) == '0') {
6            return 0;
7        }
8
9        int[] dp = new int[n + 1];
10        dp[0] = 1;
11        dp[1] = 1;
12
13        for (int i = 2; i <= n; i++) {
14            int oneDigit = s.charAt(i - 1) - '0';
15            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
16
17            if (oneDigit >= 1) {
18                dp[i] += dp[i - 1];
19            }
20
21            if (twoDigits >= 10 && twoDigits <= 26) {
22                dp[i] += dp[i - 2];
23            }
24        }
25
26        return dp[n];
27    }
28}