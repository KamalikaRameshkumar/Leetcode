// Last updated: 7/17/2026, 3:00:50 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target|| nums[r]==target || nums[l]==target){
                return true;
            }
            l++;
            r--;
        }
        return false;
    }
}