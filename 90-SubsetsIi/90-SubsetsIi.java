// Last updated: 7/17/2026, 3:00:41 PM
import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());

        return result;
    }

    public void backtrack(int[] nums, int index, List<Integer> list) {

        result.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1])
                continue;

            list.add(nums[i]);

            backtrack(nums, i + 1, list);

            list.remove(list.size() - 1);
        }
    }
}