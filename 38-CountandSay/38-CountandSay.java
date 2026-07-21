// Last updated: 7/21/2026, 10:00:16 AM
1class Solution {
2    public boolean isNumber(String s) {
3
4        boolean seenDigit = false;
5        boolean seenDot = false;
6        boolean seenExp = false;
7
8        for (int i = 0; i < s.length(); i++) {
9
10            char c = s.charAt(i);
11
12            if (Character.isDigit(c)) {
13                seenDigit = true;
14            }
15
16            else if (c == '+' || c == '-') {
17                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
18                    return false;
19                }
20            }
21
22            else if (c == '.') {
23                if (seenDot || seenExp) {
24                    return false;
25                }
26                seenDot = true;
27            }
28
29            else if (c == 'e' || c == 'E') {
30                if (seenExp || !seenDigit) {
31                    return false;
32                }
33                seenExp = true;
34                seenDigit = false;
35            }
36
37            else {
38                return false;
39            }
40        }
41
42        return seenDigit;
43    }
44}