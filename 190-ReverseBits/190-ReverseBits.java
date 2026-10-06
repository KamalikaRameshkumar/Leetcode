// Last updated: 10/6/2026, 9:17:06 AM
1class Solution {
2    public int reverseBits(int n) {
3        int result = 0;
4
5        for (int i = 0; i < 32; i++) {
6            result = (result << 1) | (n & 1);
7            n = n >> 1;
8        }
9
10        return result;
11    }
12}