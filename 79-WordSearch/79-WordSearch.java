// Last updated: 8/4/2026, 9:53:18 AM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7    private void backtrack(String s, int start,
8                            List<String> current,
9                            List<List<String>> result) {
10        if (start == s.length()) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14        for (int end = start; end < s.length(); end++) {
15            if (isPalindrome(s, start, end)) {
16                String part = s.substring(start, end + 1);
17                current.add(part);
18                backtrack(s, end + 1, current, result);
19                current.remove(current.size() - 1);
20            }
21        }
22    }
23    private boolean isPalindrome(String s, int left, int right) {
24        while (left < right) {
25            if (s.charAt(left) != s.charAt(right)) {
26                return false;
27            }
28            left++;
29            right--;
30        }
31        return true;
32    }
33}