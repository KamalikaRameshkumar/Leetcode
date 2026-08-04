// Last updated: 8/4/2026, 9:23:17 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2) {
4            return nums.length;
5        }
6        int k = 2;
7        for (int i = 2; i < nums.length; i++) {
8            if (nums[i] != nums[k - 2]) {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13        return k;
14    }
15}