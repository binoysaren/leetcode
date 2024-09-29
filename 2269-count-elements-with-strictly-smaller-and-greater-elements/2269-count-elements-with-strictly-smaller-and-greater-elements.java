class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int less = 0;
            int gret = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]<a){
                    less++;
                }
                if (nums[j]>a) {
                    gret++;
                }
            }
            if (less >= 1 && gret >= 1) {
                count++;
            }
        }
        return count;
    }
}