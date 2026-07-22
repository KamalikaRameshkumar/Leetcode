// Last updated: 7/22/2026, 3:16:52 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        HashMap<String, List<String>> map = new HashMap<>();
6
7        for (String str : strs) {
8            char[] ch = str.toCharArray();
9            Arrays.sort(ch);
10            String key = new String(ch);
11
12            if (!map.containsKey(key)) {
13                map.put(key, new ArrayList<>());
14            }
15
16            map.get(key).add(str);
17        }
18
19        return new ArrayList<>(map.values());
20    }
21}