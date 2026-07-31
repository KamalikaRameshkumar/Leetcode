// Last updated: 7/31/2026, 10:16:23 AM
1import java.util.*;
2
3class Solution {
4
5    class TrieNode {
6        TrieNode[] children = new TrieNode[26];
7        String word;
8    }
9
10    TrieNode root = new TrieNode();
11    List<String> result = new ArrayList<>();
12
13    public List<String> findWords(char[][] board, String[] words) {
14        for (String word : words) {
15            TrieNode node = root;
16            for (char c : word.toCharArray()) {
17                int index = c - 'a';
18                if (node.children[index] == null) {
19                    node.children[index] = new TrieNode();
20                }
21                node = node.children[index];
22            }
23            node.word = word;
24        }
25
26        int m = board.length;
27        int n = board[0].length;
28
29        for (int i = 0; i < m; i++) {
30            for (int j = 0; j < n; j++) {
31                dfs(board, i, j, root);
32            }
33        }
34
35        return result;
36    }
37
38    private void dfs(char[][] board, int i, int j, TrieNode node) {
39        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
40            return;
41        }
42
43        char c = board[i][j];
44
45        if (c == '#' || node.children[c - 'a'] == null) {
46            return;
47        }
48
49        node = node.children[c - 'a'];
50
51        if (node.word != null) {
52            result.add(node.word);
53            node.word = null;
54        }
55
56        board[i][j] = '#';
57
58        dfs(board, i + 1, j, node);
59        dfs(board, i - 1, j, node);
60        dfs(board, i, j + 1, node);
61        dfs(board, i, j - 1, node);
62
63        board[i][j] = c;
64    }
65}