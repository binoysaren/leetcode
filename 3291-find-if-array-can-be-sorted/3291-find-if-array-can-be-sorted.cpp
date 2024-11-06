#include <vector>
#include <algorithm>

class Solution {
public:
    bool yes(const std::vector<int>& nums, int index) {
        int cnt1 = 0, cnt2 = 0;
        int k = nums[index];
        int v = nums[index - 1];
        
        
        while (k > 0) {        
            if (k & 1) cnt1++;
            k >>= 1;
        }
        
        
        while (v > 0) {        
            if (v & 1) cnt2++;
            v >>= 1;
        }
        
        return cnt1 == cnt2;
    }
    
    bool canSortArray(std::vector<int>& nums) {
        int n = nums.size();
        std::vector<int> prev(nums);  
        std::vector<int> curr(nums);  

        bool isChanged;
        
        do {
            isChanged = false;

            
            for (int i = 1; i < n; i++) {
                if (yes(nums, i) && nums[i] < nums[i - 1]) {
                    std::swap(nums[i], nums[i - 1]);
                    isChanged = true;
                }
            }

            curr = nums;  

            
            if (prev == curr) {
                break;  
            }

            prev = curr;  

        } while (isChanged);

        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        
        return true;
    }
};
