class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int minSiz = 1e9;
        int sum = 0;
        int i = 0 ;int  j = 0;
        while(j < nums.size()) {
            sum += nums[j];
            while(sum >= target) {
                sum = sum - nums[i];
                minSiz = min(minSiz, (j-i+1));
                i++;
            }
           j++;
        }
        if(minSiz == 1e9) return 0;
        else return minSiz;
    }
};