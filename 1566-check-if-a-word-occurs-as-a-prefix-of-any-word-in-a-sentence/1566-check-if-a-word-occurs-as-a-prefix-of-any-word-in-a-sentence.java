class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] temp = sentence.split(" ");
        int index = -1;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() >= searchWord.length()) {
                if (searchWord.equals(temp[i].substring(0, searchWord.length() ))) {
                    return i+1;
                }
            }
        }
        return index;
    }
}