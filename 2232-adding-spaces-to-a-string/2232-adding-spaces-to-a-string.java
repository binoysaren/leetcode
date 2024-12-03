class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int incre = 0;
        for (int i = 0; i < spaces.length; i++) {
            sb.insert(spaces[i] + incre, " ");
            incre++;
        }
        return sb.toString();
    }
}
