// Last updated: 7/17/2026, 3:00:44 PM
import java.util.HashMap;

class Solution {

    HashMap<String, Boolean> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {

        if (s1.equals(s2))
            return true;

        if (s1.length() != s2.length())
            return false;

        String key = s1 + "#" + s2;

        if (map.containsKey(key))
            return map.get(key);

        // Check character frequencies
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x != 0) {
                map.put(key, false);
                return false;
            }
        }

        int n = s1.length();

        for (int i = 1; i < n; i++) {

            // Without swap
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {

                map.put(key, true);
                return true;
            }

            // With swap
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
                isScramble(s1.substring(i), s2.substring(0, n - i))) {

                map.put(key, true);
                return true;
            }
        }

        map.put(key, false);
        return false;
    }
}