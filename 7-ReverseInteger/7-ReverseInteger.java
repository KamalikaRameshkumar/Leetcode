// Last updated: 7/17/2026, 3:01:47 PM
class Solution {
    public int reverse(int x) {
        int og=x;
        long d=0;
        while(x!=0){
            int rem=x%10;
            d=(d*10)+rem;
            x=x/10;
        }
        if(d<Integer.MIN_VALUE||d>Integer.MAX_VALUE)
        return 0;

        return (int) d;

    }
}