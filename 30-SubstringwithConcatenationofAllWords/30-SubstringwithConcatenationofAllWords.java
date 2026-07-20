// Last updated: 7/20/2026, 7:09:29 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5        List<Integer> result = new ArrayList<>();
6
7        if (s == null || s.length() == 0 || words.length == 0)
8            return result;
9
10        int wordLen = words[0].length();
11        int wordCount = words.length;
12
13        HashMap<String, Integer> map = new HashMap<>();
14        for (String word : words) {
15            map.put(word, map.getOrDefault(word, 0) + 1);
16        }
17
18        for (int i = 0; i < wordLen; i++) {
19            int left = i, count = 0;
20            HashMap<String, Integer> seen = new HashMap<>();
21
22            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
23                String word = s.substring(j, j + wordLen);
24
25                if (map.containsKey(word)) {
26                    seen.put(word, seen.getOrDefault(word, 0) + 1);
27                    count++;
28
29                    while (seen.get(word) > map.get(word)) {
30                        String leftWord = s.substring(left, left + wordLen);
31                        seen.put(leftWord, seen.get(leftWord) - 1);
32                        left += wordLen;
33                        count--;
34                    }
35
36                    if (count == wordCount) {
37                        result.add(left);
38
39                        String leftWord = s.substring(left, left + wordLen);
40                        seen.put(leftWord, seen.get(leftWord) - 1);
41                        left += wordLen;
42                        count--;
43                    }
44                } else {
45                    seen.clear();
46                    count = 0;
47                    left = j + wordLen;
48                }
49            }
50        }
51
52        return result;
53    }
54}