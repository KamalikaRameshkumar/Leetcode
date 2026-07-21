// Last updated: 7/21/2026, 10:25:15 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        if (num1.equals("0") || num2.equals("0")) {
5            return "0";
6        }
7
8        int m = num1.length();
9        int n = num2.length();
10
11        int[] result = new int[m + n];
12
13        for (int i = m - 1; i >= 0; i--) {
14            for (int j = n - 1; j >= 0; j--) {
15
16                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
17
18                int sum = mul + result[i + j + 1];
19
20                result[i + j + 1] = sum % 10;
21                result[i + j] += sum / 10;
22            }
23        }
24
25        StringBuilder sb = new StringBuilder();
26
27        for (int num : result) {
28            if (!(sb.length() == 0 && num == 0)) {
29                sb.append(num);
30            }
31        }
32
33        return sb.toString();
34    }
35}