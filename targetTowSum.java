
// Q. finding two Sum arrys 
import java.util.*;

public class targetTowSum {

    public static void main(String[] args) {
        int[] num = { 2, 7, 11, 15, 5, 6, 3, 2, 1 };

        System.out.println(Arrays.toString(OptomizedTowSum(num, 26)));
    }

    // Using hashset
    // time complexity O(n)
    public static int[] OptomizedTowSum(int[] num, int Target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int temp = Target - num[i];

            if (map.containsKey(temp)) {

                return new int[] { map.get(temp), i };
            } else {
                map.put(num[i], i);
            }
        }
        return new int[] {};
    }
}
