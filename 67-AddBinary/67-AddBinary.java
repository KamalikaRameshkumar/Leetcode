// Last updated: 7/17/2026, 3:00:59 PM
class Solution {
    public String addBinary(String a, String b) {

        String ans = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            ans = (sum % 2) + ans;
            carry = sum / 2;
        }

        return ans;
    }
}