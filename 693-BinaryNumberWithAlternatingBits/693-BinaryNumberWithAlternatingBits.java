// Last updated: 7/17/2026, 2:58:53 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return (x&(x+1))==0;
        
    }
}