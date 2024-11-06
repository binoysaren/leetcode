#include <vector>
#include <algorithm>

class Solution {
public:
    bool yes(const std::vector<int>& nums, int index) {
        int cnt1 = 0, cnt2 = 0;
        int k = nums[index];
        int v = nums[index - 1];
        
        // Count set bits in k
        while (k > 0) {        
            if (k & 1) cnt1++;
            k >>= 1;
        }
        
        // Count set bits in v
        while (v > 0) {        
            if (v & 1) cnt2++;
            v >>= 1;
        }
        
        return cnt1 == cnt2;
    }
    
    bool canSortArray(std::vector<int>& nums) {
        int n = nums.size();
        std::vector<int> prev(nums);  // Initialize `prev` with the initial state of `nums`
        std::vector<int> curr(nums);  // Initialize `curr` with the initial state of `nums`

        bool isChanged;
        
        do {
            isChanged = false;

            // Attempt to sort using the condition
            for (int i = 1; i < n; i++) {
                if (yes(nums, i) && nums[i] < nums[i - 1]) {
                    std::swap(nums[i], nums[i - 1]);
                    isChanged = true;
                }
            }

            curr = nums;  // Update `curr` to the current state of `nums`

            // Check if any elements have changed from the previous iteration
            if (prev == curr) {
                break;  // Exit loop if no changes were made
            }

            prev = curr;  // Update `prev` for the next iteration

        } while (isChanged);

        // Final check if the array is sorted
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        
        return true;
    }
};
