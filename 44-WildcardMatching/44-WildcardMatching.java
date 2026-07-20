// Last updated: 7/20/2026, 7:12:04 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0;
4        int star = -1, match = 0;
5
6        while (i < s.length()) {
7            if (j < p.length() &&
8                (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
9                i++;
10                j++;
11            } 
12            else if (j < p.length() && p.charAt(j) == '*') {
13                star = j;
14                match = i;
15                j++;
16            } 
17            else if (star != -1) {
18                j = star + 1;
19                match++;
20                i = match;
21            } 
22            else {
23                return false;
24            }
25        }
26
27        while (j < p.length() && p.charAt(j) == '*') {
28            j++;
29        }
30
31        return j == p.length();
32    }
33}