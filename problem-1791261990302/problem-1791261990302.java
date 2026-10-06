// Last updated: 10/6/2026, 10:16:30 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int ans = nums[0];
6        for (int i = 1; i < nums.length; i++) {
7            int num = nums[i];
8            if (num < 0) {
9                int temp = max;
10                max = min;
11                min = temp;
12            }
13            max = Math.max(num, max * num);
14            min = Math.min(num, min * num);
15            ans = Math.max(ans, max);
16        }
17        return ans;
18    }
19}