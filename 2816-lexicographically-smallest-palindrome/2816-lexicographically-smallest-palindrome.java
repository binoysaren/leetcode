class Solution {
    public String makeSmallestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb=new StringBuilder(s);
        while (i <= j) {
            if (sb.charAt(i)< sb.charAt(j)) {
                sb.setCharAt(j, sb.charAt(i));
            } else if (sb.charAt(i) > sb.charAt(j)) {
                sb.setCharAt(i, sb.charAt(j));
            } else {
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}