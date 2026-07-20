// Last updated: 7/20/2026, 7:13:39 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right) {
7            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
8                left++;
9            }
10
11            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
12                right--;
13            }
14
15            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
16                return false;
17            }
18
19            left++;
20            right--;
21        }
22
23        return true;
24    }
25}