// Last updated: 7/17/2026, 2:58:17 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int og=n;
        int s=0;
        int p=1;
        while(n!=0){
            int d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        int result=p-s;
        return result;
        
    }
}