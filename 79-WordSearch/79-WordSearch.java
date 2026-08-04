// Last updated: 8/4/2026, 9:49:56 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for (int num : nums) {
5            set.add(num);
6        }
7        int longest = 0;
8        for (int num : set) {
9            if (!set.contains(num - 1)) {
10                int current = num;
11                int length = 1;
12                while (set.contains(current + 1)) {
13                    current++;
14                    length++;
15                }
16                longest = Math.max(longest, length);
17            }
18        }
19        return longest;
20    }
21}