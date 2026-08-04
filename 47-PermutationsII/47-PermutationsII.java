// Last updated: 8/4/2026, 9:13:16 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int farthest = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (i > farthest) {
6                return false;
7            }
8            farthest = Math.max(farthest, i + nums[i]);
9            if (farthest >= nums.length - 1) {
10                return true;
11            }
12        }
13        return true;
14    }
15}