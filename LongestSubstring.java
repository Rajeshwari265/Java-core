package Jvacore;

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (map.containsKey(currentChar)) {
                
                left = Math.max(left, map.get(currentChar));
            }
            
            
            maxLength = Math.max(maxLength, right - left + 1);
            
            map.put(currentChar, right + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String test = "abcabcbb";
        System.out.println("Length of longest unique substring: " + lengthOfLongestSubstring(test));
        
    }
}
