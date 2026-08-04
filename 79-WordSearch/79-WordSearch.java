// Last updated: 8/4/2026, 9:29:17 AM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7    private void backtrack(String s, int start,
8                            List<String> parts,
9                            List<String> result) {
10        if (parts.size() == 4) {
11            if (start == s.length()) {
12                result.add(String.join(".", parts));
13            }
14            return;
15        }
16        for (int end = start; end < Math.min(start + 3, s.length()); end++) {
17            String part = s.substring(start, end + 1);
18            if (part.length() > 1 && part.charAt(0) == '0') {
19                break;
20            }
21            if (Integer.parseInt(part) > 255) {
22                break;
23            }
24            parts.add(part);
25            backtrack(s, end + 1, parts, result);
26            parts.remove(parts.size() - 1);
27        }
28    }
29}