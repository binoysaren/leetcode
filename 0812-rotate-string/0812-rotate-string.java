class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int g = goal.length();
        if (n != g)
            return false;
        return (s+s).contains(goal);
    }
}