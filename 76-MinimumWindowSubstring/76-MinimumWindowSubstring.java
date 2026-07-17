// Last updated: 7/17/2026, 3:00:51 PM
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        int[] count = new int[128];

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();

        while (right < s.length()) {

            char ch = s.charAt(right);

            if (count[ch] > 0)
                required--;

            count[ch]--;
            right++;

            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char c = s.charAt(left);

                count[c]++;

                if (count[c] > 0)
                    required++;

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }
}