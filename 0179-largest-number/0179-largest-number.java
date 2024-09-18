class Solution {
    public String largestNumber(int[] nums) {
        String[] numString = new String[nums.length];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            numString[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numString, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (numString[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numString) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();
    }
}