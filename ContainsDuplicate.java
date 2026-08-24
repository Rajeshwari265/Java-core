package Jvacore;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        System.out.println("Contains duplicate: " + hasDuplicate(numbers));
        
    }
}
