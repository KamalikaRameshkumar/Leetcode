// Last updated: 7/17/2026, 3:00:23 PM
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> lis = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {

                    lis.add(1);

                } else {

                    int value = li.get(i - 1).get(j - 1)
                              + li.get(i - 1).get(j);

                    lis.add(value);
                }
            }

            li.add(lis);
        }

        return li;
    }
}