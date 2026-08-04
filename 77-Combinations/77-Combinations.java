// Last updated: 8/4/2026, 9:18:48 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(1, n, k, new ArrayList<>(), result);
5        return result;
6    }
7    private void backtrack(int start, int n, int k,
8                           List<Integer> current,
9                           List<List<Integer>> result) {
10        if (current.size() == k) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14        for (int i = start; i <= n; i++) {
15            current.add(i);
16            backtrack(i + 1, n, k, current, result);
17            current.remove(current.size() - 1);
18        }
19    }
20}