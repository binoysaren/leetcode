class Solution {
    public long maxArrayValue(int[] nums) {
       Stack<Long> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            long curr = nums[i]; 
            while (!s.isEmpty() && s.peek() >= curr) {
                curr += s.pop();
            }
            s.push(curr);
        }
        long max = 0;
        while (!s.isEmpty()) {
            max = Math.max(max, s.pop());
        }
        return max;
    }
}