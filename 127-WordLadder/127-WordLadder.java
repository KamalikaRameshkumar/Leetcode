// Last updated: 7/21/2026, 10:24:34 AM
1class Solution {
2
3    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
4
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(candidates);
7
8        backtrack(candidates, target, 0, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] candidates, int target, int index,
14                           List<Integer> current, List<List<Integer>> result) {
15
16        if (target == 0) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        if (target < 0) {
22            return;
23        }
24
25        for (int i = index; i < candidates.length; i++) {
26
27            // Skip duplicates
28            if (i > index && candidates[i] == candidates[i - 1]) {
29                continue;
30            }
31
32            if (candidates[i] > target) {
33                break;
34            }
35
36            current.add(candidates[i]);
37
38            // Move to the next index (each number can be used only once)
39            backtrack(candidates, target - candidates[i], i + 1, current, result);
40
41            current.remove(current.size() - 1);
42        }
43    }
44}