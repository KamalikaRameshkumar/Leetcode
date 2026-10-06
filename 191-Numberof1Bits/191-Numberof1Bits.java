// Last updated: 10/6/2026, 9:18:12 AM
1class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4
5        while (n != 0) {
6            count += n & 1;
7            n = n >> 1;
8        }
9
10        return count;
11    }
12}