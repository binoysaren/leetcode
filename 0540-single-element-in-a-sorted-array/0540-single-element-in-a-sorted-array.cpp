class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int num = 0;
        for(auto x : nums) {
            num = num ^ x;
        }
        return num;
    }
};