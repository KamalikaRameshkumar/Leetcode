// Last updated: 7/17/2026, 3:00:20 PM
class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            int profit = arr[i] - min;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
