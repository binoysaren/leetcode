class Solution {
    public String compressedString(String word) {
        int count = 0;
        char ch = '0';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch && count < 9) {
                count++;
            } else {
                if (count > 0) {
                    sb.append(count);
                    sb.append(ch);
                }
                ch = word.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(ch);
        return sb.toString();
    }
}