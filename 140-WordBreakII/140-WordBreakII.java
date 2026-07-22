// Last updated: 7/22/2026, 3:14:08 PM
1import java.util.*;
2class Solution {
3    public List<String> wordBreak(String s, List<String> wordDict) {
4        Set<String> set = new HashSet<>(wordDict);
5        Map<String, List<String>> memo = new HashMap<>();
6        return dfs(s, set, memo);
7    }
8    private List<String> dfs(String s, Set<String> set, Map<String, List<String>> memo) {
9        if (memo.containsKey(s)) {
10            return memo.get(s);
11        }
12        List<String> result = new ArrayList<>();
13        if (s.length() == 0) {
14            result.add("");
15            return result;
16        }
17        for (String word : set) {
18            if (s.startsWith(word)) {
19                List<String> subList = dfs(s.substring(word.length()), set, memo);
20                for (String sub : subList) {
21                    if (sub.equals("")) {
22                        result.add(word);
23                    } else {
24                        result.add(word + " " + sub);
25                    }
26                }
27            }
28        }
29
30        memo.put(s, result);
31        return result;
32    }
33}