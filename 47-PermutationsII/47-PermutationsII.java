// Last updated: 8/4/2026, 9:15:14 AM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> result = new ArrayList<>();
4        int i = 0;
5        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
6            result.add(intervals[i]);
7            i++;
8        }
9        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
10            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
11            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
12            i++;
13        }
14        result.add(newInterval);
15        while (i < intervals.length) {
16            result.add(intervals[i]);
17            i++;
18        }
19        return result.toArray(new int[result.size()][]);
20    }
21}