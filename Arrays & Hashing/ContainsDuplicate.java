/* https://leetcode.com/problems/contains-duplicate/ */

/* This solution uses Hashmap to find existing number from unsorted array. and return true if found */
/* Time Complexity: O(n) */
/* Space Complexity: O(n) */
/* Because solution loop through the array once, and store value in map once */

import java.util.HashMap;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        // Hash table to keep track of all previouse numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // loop through an array to check twice value.

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            map.put(nums[i], 0);
        }
        return false;
    }
}