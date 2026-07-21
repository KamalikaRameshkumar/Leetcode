// Last updated: 7/21/2026, 9:37:58 AM
1class Solution {
2
3    public List<List<Integer>> subsets(int[] nums) {
4
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(0, nums, new ArrayList<>(), result);
7        return result;
8    }
9
10    public void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
11
12        result.add(new ArrayList<>(current));
13
14        for (int i = index; i < nums.length; i++) {
15            current.add(nums[i]);
16            backtrack(i + 1, nums, current, result);
17            current.remove(current.size() - 1);
18        }
19    }
20}