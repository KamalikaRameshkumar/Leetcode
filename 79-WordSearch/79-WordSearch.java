// Last updated: 8/4/2026, 9:56:48 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones = 0;
4        int twos = 0;
5        for (int num : nums) {
6            ones = (ones ^ num) & ~twos;
7            twos = (twos ^ num) & ~ones;
8        }
9        return ones;
10    }
11}