// Last updated: 7/25/2026, 10:17:06 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        boolean firstRowZero = false;
6        boolean firstColZero = false;
7        for (int j = 0; j < cols; j++) {
8            if (matrix[0][j] == 0) {
9                firstRowZero = true;
10                break;
11            }
12        }
13        for (int i = 0; i < rows; i++) {
14            if (matrix[i][0] == 0) {
15                firstColZero = true;
16                break;
17            }
18        }
19        for (int i = 1; i < rows; i++) {
20            for (int j = 1; j < cols; j++) {
21                if (matrix[i][j] == 0) {
22                    matrix[i][0] = 0;
23                    matrix[0][j] = 0;
24                }
25            }
26        }
27        for (int i = 1; i < rows; i++) {
28            for (int j = 1; j < cols; j++) {
29                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
30                    matrix[i][j] = 0;
31                }
32            }
33        }
34        if (firstRowZero) {
35            for (int j = 0; j < cols; j++) {
36                matrix[0][j] = 0;
37            }
38        }
39        if (firstColZero) {
40            for (int i = 0; i < rows; i++) {
41                matrix[i][0] = 0;
42            }
43        }
44    }
45}