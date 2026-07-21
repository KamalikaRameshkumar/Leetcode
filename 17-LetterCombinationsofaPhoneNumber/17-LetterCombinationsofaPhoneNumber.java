// Last updated: 7/21/2026, 9:49:33 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5        stack.push(-1);
6
7        int max = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10
11            if (s.charAt(i) == '(') {
12                stack.push(i);
13            } else {
14                stack.pop();
15
16                if (stack.isEmpty()) {
17                    stack.push(i);
18                } else {
19                    max = Math.max(max, i - stack.peek());
20                }
21            }
22        }
23
24        return max;
25    }
26}