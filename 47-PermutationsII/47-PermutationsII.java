// Last updated: 8/4/2026, 9:10:09 AM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        boolean[] used = new boolean[nums.length];
6        backtrack(nums, used, new ArrayList<>(), result);
7        return result;
8    }
9    private void backtrack(int[] nums, boolean[] used,
10                           List<Integer> current,
11                           List<List<Integer>> result) {
12        if (current.size() == nums.length) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16        for (int i = 0; i < nums.length; i++) {
17            if (used[i]) {
18                continue;
19            }
20            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
21                continue;
22            }
23            used[i] = true;
24            current.add(nums[i]);
25            backtrack(nums, used, current, result);
26            current.remove(current.size() - 1);
27            used[i] = false;
28        }
29    }
30}