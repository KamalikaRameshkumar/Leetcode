// Last updated: 7/17/2026, 2:58:14 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int ss=0;
        while(n>0){
            int d=n%10;
            ds=ds+d;
            ss=ss+d*d;
            n/=10;
        }
        return (ss-ds)>=50;
        
    }
}