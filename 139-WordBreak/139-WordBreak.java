// Last updated: 8/11/2026, 9:36:59 AM
1class LRUCache {
2
3    class Node {
4        int key;
5        int value;
6        Node prev;
7        Node next;
8
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    private int capacity;
16    private HashMap<Integer, Node> map;
17    private Node head;
18    private Node tail;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        map = new HashMap<>();
23
24        head = new Node(0, 0);
25        tail = new Node(0, 0);
26
27        head.next = tail;
28        tail.prev = head;
29    }
30
31    public int get(int key) {
32
33        if (!map.containsKey(key)) {
34            return -1;
35        }
36
37        Node node = map.get(key);
38
39        remove(node);
40        add(node);
41
42        return node.value;
43    }
44
45    public void put(int key, int value) {
46
47        if (map.containsKey(key)) {
48            Node node = map.get(key);
49
50            node.value = value;
51
52            remove(node);
53            add(node);
54
55        } else {
56
57            Node node = new Node(key, value);
58
59            map.put(key, node);
60            add(node);
61
62            if (map.size() > capacity) {
63
64                Node lru = head.next;
65
66                remove(lru);
67                map.remove(lru.key);
68            }
69        }
70    }
71
72    private void remove(Node node) {
73
74        node.prev.next = node.next;
75        node.next.prev = node.prev;
76    }
77
78    private void add(Node node) {
79
80        node.next = tail;
81        node.prev = tail.prev;
82
83        tail.prev.next = node;
84        tail.prev = node;
85    }
86}
87
88/**
89 * Your LRUCache object will be instantiated and called as such:
90 * LRUCache obj = new LRUCache(capacity);
91 * int param_1 = obj.get(key);
92 * obj.put(key,value);
93 */