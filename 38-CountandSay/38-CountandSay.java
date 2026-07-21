// Last updated: 7/21/2026, 9:52:49 AM
1class Solution {
2    public String countAndSay(int n) {
3
4        String result = "1";
5
6        for (int i = 2; i <= n; i++) {
7
8            StringBuilder sb = new StringBuilder();
9            int count = 1;
10
11            for (int j = 1; j < result.length(); j++) {
12
13                if (result.charAt(j) == result.charAt(j - 1)) {
14                    count++;
15                } else {
16                    sb.append(count);
17                    sb.append(result.charAt(j - 1));
18                    count = 1;
19                }
20            }
21
22            sb.append(count);
23            sb.append(result.charAt(result.length() - 1));
24
25            result = sb.toString();
26        }
27
28        return result;
29    }
30}