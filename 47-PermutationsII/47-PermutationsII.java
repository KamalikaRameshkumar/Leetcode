// Last updated: 8/4/2026, 9:11:23 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        for (int i = 0; i < n; i++) {
5            for (int j = i; j < n; j++) {
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for (int i = 0; i < n; i++) {
12            int left = 0;
13            int right = n - 1;
14            while (left < right) {
15                int temp = matrix[i][left];
16                matrix[i][left] = matrix[i][right];
17                matrix[i][right] = temp;
18                left++;
19                right--;
20            }
21        }
22    }
23}