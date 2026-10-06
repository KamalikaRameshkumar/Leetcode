// Last updated: 10/6/2026, 9:17:42 AM
1import java.util.*;
2
3class Solution {
4    public List<String> findRepeatedDnaSequences(String s) {
5        Set<String> seen = new HashSet<>();
6        Set<String> repeated = new HashSet<>();
7
8        for (int i = 0; i <= s.length() - 10; i++) {
9            String sequence = s.substring(i, i + 10);
10
11            if (!seen.add(sequence)) {
12                repeated.add(sequence);
13            }
14        }
15
16        return new ArrayList<>(repeated);
17    }
18}