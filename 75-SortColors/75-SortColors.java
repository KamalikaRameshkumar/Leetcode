// Last updated: 7/21/2026, 9:37:06 AM
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int low = 0;
5        int mid = 0;
6        int high = nums.length - 1;
7
8        while (mid <= high) {
9
10            if (nums[mid] == 0) {
11                int temp = nums[low];
12                nums[low] = nums[mid];
13                nums[mid] = temp;
14                low++;
15                mid++;
16            }
17
18            else if (nums[mid] == 1) {
19                mid++;
20            }
21
22            else {
23                int temp = nums[mid];
24                nums[mid] = nums[high];
25                nums[high] = temp;
26                high--;
27            }
28        }
29    }
30}