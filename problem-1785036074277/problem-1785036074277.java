// Last updated: 7/26/2026, 8:51:14 AM
1import java.util.*;
2class Solution{
3    public List<List<Integer>>aggregateTimeSeries(int[][] series1, int[][]series2){
4        TreeSet<Integer> set= new TreeSet<>();
5        for(int[]x:series1){
6            set.add(x[0]);
7        }
8        for(int[]x:series2){
9            set.add(x[0]);
10        }
11        int[] times= new int[set.size()];
12        int idx=0;
13        for(int t:set){
14            times[idx++]=t;
15        }
16        List<List<Integer>> ans= new ArrayList<>();
17        int i=0;
18        int j=0;
19        for(int k=0;k<times.length;k++){
20            int t=times[k];
21            while(i<series1.length && series1[i][0]<t){
22                i++;
23            }
24            while(j<series2.length && series2[j][0]<t){
25                j++;
26            }
27            int v1=(i<series1.length)?series1[i][1]:0;
28            int v2=(j<series2.length)?series2[j][1]:0;
29            ans.add(Arrays.asList(t, v1+v2));
30        }
31        return ans;
32    }
33}