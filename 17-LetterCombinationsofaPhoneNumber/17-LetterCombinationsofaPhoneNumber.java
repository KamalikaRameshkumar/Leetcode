// Last updated: 7/21/2026, 9:47:39 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        if (dividend == Integer.MIN_VALUE && divisor == -1) {
5            return Integer.MAX_VALUE;
6        }
7
8        long dvd = Math.abs((long) dividend);
9        long dvs = Math.abs((long) divisor);
10
11        int result = 0;
12
13        while (dvd >= dvs) {
14
15            long temp = dvs;
16            int multiple = 1;
17
18            while (dvd >= (temp << 1)) {
19                temp <<= 1;
20                multiple <<= 1;
21            }
22
23            dvd -= temp;
24            result += multiple;
25        }
26
27        if ((dividend > 0) ^ (divisor > 0)) {
28            return -result;
29        }
30
31        return result;
32    }
33}