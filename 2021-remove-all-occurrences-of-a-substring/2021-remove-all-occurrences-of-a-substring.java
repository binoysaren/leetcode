class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.toString().contains(part)) {
            int index = sb.indexOf(part);
            if (index != -1) {
                sb.delete(index, index + part.length());
            }
        }
        return sb.toString();
    }
}