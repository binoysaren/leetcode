import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 1; // Start checking from 1
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        // Add positive numbers to the set
        for(int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }
        
        // Check for the first missing positive
        while (set.contains(ans)) {
            ans++;
        }
        
        return ans;
    }
}
