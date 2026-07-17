// Last updated: 7/17/2026, 2:58:34 PM
class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        if(n<=0)
        return 0;
        for(int i=3;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
}