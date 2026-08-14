// Last updated: 8/14/2026, 3:16:33 PM
1import java.util.Stack;
2
3class Solution {
4    public int evalRPN(String[] tokens) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        for (String token : tokens) {
9
10            if (token.equals("+") || token.equals("-") ||
11                token.equals("*") || token.equals("/")) {
12
13                int b = stack.pop();
14                int a = stack.pop();
15
16                int result = 0;
17
18                if (token.equals("+")) {
19                    result = a + b;
20                } 
21                else if (token.equals("-")) {
22                    result = a - b;
23                } 
24                else if (token.equals("*")) {
25                    result = a * b;
26                } 
27                else {
28                    result = a / b;
29                }
30
31                stack.push(result);
32            } 
33            else {
34                stack.push(Integer.parseInt(token));
35            }
36        }
37
38        return stack.pop();
39    }
40}