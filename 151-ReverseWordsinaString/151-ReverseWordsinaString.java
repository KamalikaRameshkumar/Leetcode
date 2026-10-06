// Last updated: 10/6/2026, 9:52:29 AM
1class Solution {
2    public String reverseWords(String s) {
3
4        // Remove leading/trailing spaces and split by one or more spaces
5        String[] words = s.trim().split("\\s+");
6
7        StringBuilder result = new StringBuilder();
8
9        // Add words in reverse order
10        for (int i = words.length - 1; i >= 0; i--) {
11            result.append(words[i]);
12
13            if (i != 0) {
14                result.append(" ");
15            }
16        }
17
18        return result.toString();
19    }
20}