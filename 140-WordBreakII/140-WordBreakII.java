// Last updated: 7/22/2026, 3:13:19 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15import java.util.HashMap;
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) {
19            return null;
20        }
21        HashMap<Node, Node> map = new HashMap<>();
22        Node curr = head;
23        while (curr != null) {
24            map.put(curr, new Node(curr.val));
25            curr = curr.next;
26        }
27        curr = head;
28        while (curr != null) {
29            map.get(curr).next = map.get(curr.next);
30            map.get(curr).random = map.get(curr.random);
31            curr = curr.next;
32        }
33
34        return map.get(head);
35    }
36}