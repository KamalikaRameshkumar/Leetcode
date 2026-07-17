// Last updated: 7/17/2026, 2:59:45 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sot[]=new int[256];
        int tos[]=new int[256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(sot[c1]!=tos[c2]){
                return false;
            }
            sot[c1]=i+1;
            tos[c2]=i+1;
        }
        return true;
        
    }
}