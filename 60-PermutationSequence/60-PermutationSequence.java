// Last updated: 7/17/2026, 3:01:04 PM
import java.util.*;

class Solution {

    public String getPermutation(int n, int k) {

        List<Integer> nums = new ArrayList<>();
        int fact = 1;

        // Store numbers and calculate (n-1)!
        for (int i = 1; i < n; i++) {
            fact *= i;
            nums.add(i);
        }
        nums.add(n);

        k--;   // Convert to 0-based index

        StringBuilder ans = new StringBuilder();

        while (true) {

            ans.append(nums.get(k / fact));
            nums.remove(k / fact);

            if (nums.size() == 0)
                break;

            k = k % fact;
            fact = fact / nums.size();
        }

        return ans.toString();
    }
}