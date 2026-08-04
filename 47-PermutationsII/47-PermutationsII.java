// Last updated: 8/4/2026, 9:12:35 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long power = n;
4        if (power < 0) {
5            x = 1 / x;
6            power = -power;
7        }
8        double result = 1.0;
9        while (power > 0) {
10            if (power % 2 == 1) {
11                result = result * x;
12            }
13            x = x * x;
14            power = power / 2;
15        }
16        return result;
17    }
18}