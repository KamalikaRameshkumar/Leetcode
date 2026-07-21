// Last updated: 7/21/2026, 9:44:55 AM
1class Solution {
2
3    public List<String> letterCombinations(String digits) {
4
5        List<String> result = new ArrayList<>();
6
7        if (digits.length() == 0) {
8            return result;
9        }
10
11        String[] map = {
12            "", "", "abc", "def", "ghi", "jkl",
13            "mno", "pqrs", "tuv", "wxyz"
14        };
15
16        backtrack(digits, 0, new StringBuilder(), result, map);
17
18        return result;
19    }
20
21    public void backtrack(String digits, int index, StringBuilder current,
22                          List<String> result, String[] map) {
23
24        if (index == digits.length()) {
25            result.add(current.toString());
26            return;
27        }
28
29        String letters = map[digits.charAt(index) - '0'];
30
31        for (char ch : letters.toCharArray()) {
32            current.append(ch);
33            backtrack(digits, index + 1, current, result, map);
34            current.deleteCharAt(current.length() - 1);
35        }
36    }
37}