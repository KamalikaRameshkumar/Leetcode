// Last updated: 7/21/2026, 10:20:26 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3
4        Set<String> words = new HashSet<>(wordList);
5
6        if (!words.contains(endWord)) {
7            return 0;
8        }
9
10        Queue<String> queue = new LinkedList<>();
11        queue.offer(beginWord);
12
13        int level = 1;
14
15        while (!queue.isEmpty()) {
16
17            int size = queue.size();
18
19            for (int i = 0; i < size; i++) {
20
21                String word = queue.poll();
22
23                if (word.equals(endWord)) {
24                    return level;
25                }
26
27                char[] arr = word.toCharArray();
28
29                for (int j = 0; j < arr.length; j++) {
30
31                    char original = arr[j];
32
33                    for (char c = 'a'; c <= 'z'; c++) {
34
35                        arr[j] = c;
36                        String next = new String(arr);
37
38                        if (words.contains(next)) {
39                            queue.offer(next);
40                            words.remove(next);
41                        }
42                    }
43
44                    arr[j] = original;
45                }
46            }
47
48            level++;
49        }
50
51        return 0;
52    }
53}