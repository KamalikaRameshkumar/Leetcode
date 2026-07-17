// Last updated: 7/17/2026, 2:59:39 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n<1)
            return false;
        while(n%2==0)
            n=n/2;
        if(n==1)
            return true;
        else
            return false;
    }
    
}