/* https://leetcode.com/problems/valid-anagram/description/ */
/* Find valid anagram */

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        // check if strings match the length
        if (s.length() != t.length())
            return false;

        // make hash map
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // loop through both array at the same time
        for (int i = 0; i < t.length(); i++) {
            if (mapS.containsKey(s.charAt(i)))
                mapS.replace(s.charAt(i), (mapS.get(s.charAt(i)) + 1));
            else
                mapS.put(s.charAt(i), 0);

            if (mapT.containsKey(t.charAt(i)))
                mapT.replace(t.charAt(i), (mapT.get(t.charAt(i)) + 1));
            else
                mapT.put(t.charAt(i), 0);

        }

        // check every value in hash map and see if any valu conatin odd values
        for (int i = 0; i < t.length(); i++) {
            if (!mapT.containsKey(s.charAt(i)) || mapS.get(s.charAt(i)) != mapT.get(s.charAt(i)))
                return false;
        }

        return true;
    }
}