// Last updated: 7/17/2026, 3:01:44 PM
class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int d=0;
        if(x<0)
        return false;
        while(x!=0){
            int rem=x%10;
            d=(d*10)+rem;
            x=x/10;
        }
        if(d==og)
        return true;
        return false;
        
    }
}