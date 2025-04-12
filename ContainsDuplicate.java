//https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(isDuplicate(nums));
    }

    public static boolean isDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}
