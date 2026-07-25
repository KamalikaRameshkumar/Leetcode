// Last updated: 7/25/2026, 10:21:23 AM
1import java.util.*;
2
3class Solution {
4    public int maxPoints(int[][] points) {
5        int n = points.length;
6
7        if (n <= 2) return n;
8
9        int ans = 0;
10
11        for (int i = 0; i < n; i++) {
12
13            HashMap<String, Integer> map = new HashMap<>();
14            int max = 0;
15
16            for (int j = i + 1; j < n; j++) {
17
18                int dx = points[j][0] - points[i][0];
19                int dy = points[j][1] - points[i][1];
20
21                int g = gcd(dx, dy);
22                dx /= g;
23                dy /= g;
24                if (dx < 0) {
25                    dx = -dx;
26                    dy = -dy;
27                } else if (dx == 0) {
28                    dy = 1;
29                } else if (dy == 0) {
30                    dx = 1;
31                }
32
33                String slope = dx + "/" + dy;
34
35                map.put(slope, map.getOrDefault(slope, 0) + 1);
36
37                max = Math.max(max, map.get(slope));
38            }
39
40            ans = Math.max(ans, max + 1);
41        }
42
43        return ans;
44    }
45
46    private int gcd(int a, int b) {
47        if (b == 0) return Math.abs(a);
48        return gcd(b, a % b);
49    }
50}