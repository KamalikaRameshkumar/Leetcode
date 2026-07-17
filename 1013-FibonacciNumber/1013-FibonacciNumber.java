// Last updated: 7/17/2026, 2:58:48 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n<=0)
        return 0;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}