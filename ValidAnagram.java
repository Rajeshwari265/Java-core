import java.util.Arrays;

public class ValidAnagram {
    
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Assuming lowercase English letters (a-z), an array of size 26 is enough
        int[] charCounts = new int[26];
        
        // Count frequencies of characters in both strings
        for (int i = 0; i < s.length(); i++) {
            // Increment for string s, decrement for string t
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        
        // If they are anagrams, all counts must be exactly 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        boolean result = isAnagram(s, t);
        
        System.out.println("String 1: " + s);
        System.out.println("String 2: " + t);
        System.out.println("Are they anagrams? " + result);
    }
}