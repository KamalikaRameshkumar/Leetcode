// Last updated: 7/21/2026, 10:26:21 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int buy1 = Integer.MIN_VALUE;
5        int sell1 = 0;
6        int buy2 = Integer.MIN_VALUE;
7        int sell2 = 0;
8
9        for (int price : prices) {
10            buy1 = Math.max(buy1, -price);
11            sell1 = Math.max(sell1, buy1 + price);
12            buy2 = Math.max(buy2, sell1 - price);
13            sell2 = Math.max(sell2, buy2 + price);
14        }
15
16        return sell2;
17    }
18}