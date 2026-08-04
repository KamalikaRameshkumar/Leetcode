// Last updated: 8/4/2026, 9:55:17 AM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totalGas = 0;
4        int totalCost = 0;
5        int tank = 0;
6        int start = 0;
7        for (int i = 0; i < gas.length; i++) {
8            totalGas += gas[i];
9            totalCost += cost[i];
10            tank += gas[i] - cost[i];
11            if (tank < 0) {
12                start = i + 1;
13                tank = 0;
14            }
15        }
16        if (totalGas < totalCost) {
17            return -1;
18        }
19
20        return start;
21    }
22}