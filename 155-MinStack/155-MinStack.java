// Last updated: 10/6/2026, 10:18:43 AM
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4    public MinStack() {
5        stack = new Stack<>();
6        minStack = new Stack<>();
7    }
8    public void push(int val) {
9        stack.push(val);
10        if (minStack.isEmpty()) {
11            minStack.push(val);
12        } else {
13            minStack.push(Math.min(val, minStack.peek()));
14        }
15    }
16    public void pop() {
17        stack.pop();
18        minStack.pop();
19    }
20    public int top() {
21        return stack.peek();
22    }
23    public int getMin() {
24        return minStack.peek();
25    }
26}