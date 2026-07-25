// Last updated: 7/25/2026, 10:20:00 AM
1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4
5        int[] candies = new int[n];
6        for (int i = 0; i < n; i++) {
7            candies[i] = 1;
8        }
9        for (int i = 1; i < n; i++) {
10            if (ratings[i] > ratings[i - 1]) {
11                candies[i] = candies[i - 1] + 1;
12            }
13        }
14        for (int i = n - 2; i >= 0; i--) {
15            if (ratings[i] > ratings[i + 1]) {
16                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
17            }
18        }
19        int total = 0;
20        for (int candy : candies) {
21            total += candy;
22        }
23
24        return total;
25    }
26}