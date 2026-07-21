// Last updated: 7/21/2026, 9:55:49 AM
1class Solution {
2
3    public List<List<Integer>> combinationSum(int[] candidates, int target) {
4
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(candidates, target, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int[] candidates, int target, int index,
11                           List<Integer> current, List<List<Integer>> result) {
12
13        if (target == 0) {
14            result.add(new ArrayList<>(current));
15            return;
16        }
17
18        if (target < 0) {
19            return;
20        }
21
22        for (int i = index; i < candidates.length; i++) {
23            current.add(candidates[i]);
24            backtrack(candidates, target - candidates[i], i, current, result);
25            current.remove(current.size() - 1);
26        }
27    }
28}