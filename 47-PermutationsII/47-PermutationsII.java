// Last updated: 8/4/2026, 9:14:11 AM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
4        List<int[]> result = new ArrayList<>();
5        int start = intervals[0][0];
6        int end = intervals[0][1];
7        for (int i = 1; i < intervals.length; i++) {
8            if (intervals[i][0] <= end) {
9                end = Math.max(end, intervals[i][1]);
10            } 
11            else {
12                result.add(new int[]{start, end});
13                start = intervals[i][0];
14                end = intervals[i][1];
15            }
16        }
17        result.add(new int[]{start, end});
18
19        return result.toArray(new int[result.size()][]);
20    }
21}