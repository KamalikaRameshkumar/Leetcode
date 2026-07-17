// Last updated: 7/17/2026, 2:59:42 PM
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
      int g=nums[0];
      for(int i=1;i<nums.length;i++){
        if(g==nums[i]){
            return true;
        }
        else{
            g=nums[i];
        }
      }
      return false;
    }
}