/* https://leetcode.com/problems/two-sum */

/* Two Sum problem */
/* Time Complexity: O(n) */
/* Space Complexity: O(n) */
/* Because solution loop through the array once, and store value in map once */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                int[] r = { i, map.get(target - nums[i]) };
                return r;
            }
        }

        return nums;
    }
}