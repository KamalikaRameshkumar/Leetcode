// Last updated: 7/17/2026, 3:00:09 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";

        while (columnNumber > 0) {
            columnNumber--; // adjust for 1-based indexing
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            result = c + result; // prepend character
            columnNumber /= 26;
        }

        return result;
    }
}
