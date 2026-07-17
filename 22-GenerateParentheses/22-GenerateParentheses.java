// Last updated: 7/17/2026, 3:01:25 PM
import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        backtrack("", 0, 0, n);
        return result;
    }

    public void backtrack(String str, int open, int close, int n) {

        if (str.length() == 2 * n) {
            result.add(str);
            return;
        }

        if (open < n) {
            backtrack(str + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(str + ")", open, close + 1, n);
        }
    }
}