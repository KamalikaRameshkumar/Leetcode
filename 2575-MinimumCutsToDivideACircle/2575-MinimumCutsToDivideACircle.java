// Last updated: 7/17/2026, 2:58:13 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0){
            int k=n/2;
            return k;
        }
        else if(n==1){
            return 0;
        }
        else
        return n;
        
    }
}