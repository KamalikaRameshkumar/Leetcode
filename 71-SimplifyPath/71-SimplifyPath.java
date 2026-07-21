// Last updated: 7/21/2026, 9:39:30 AM
1class Solution {
2    public String simplifyPath(String path) {
3
4        Stack<String> stack = new Stack<>();
5
6        String[] parts = path.split("/");
7
8        for (String part : parts) {
9
10            if (part.equals("") || part.equals(".")) {
11                continue;
12            }
13
14            if (part.equals("..")) {
15                if (!stack.isEmpty()) {
16                    stack.pop();
17                }
18            } else {
19                stack.push(part);
20            }
21        }
22
23        if (stack.isEmpty()) {
24            return "/";
25        }
26
27        StringBuilder result = new StringBuilder();
28
29        for (String dir : stack) {
30            result.append("/").append(dir);
31        }
32
33        return result.toString();
34    }
35}