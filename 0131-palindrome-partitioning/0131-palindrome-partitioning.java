class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    public void backtrack(List<List<String>> result, List<String> tempList, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < s.length(); i++) {
                String substring = s.substring(start, i + 1);
                if (f(substring)) {
                    tempList.add(substring);
                    backtrack(result, tempList, s, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public boolean f(String str) {
        int x = str.length() - 1;
        int y = 0;
        while (x > y) {
            if (str.charAt(x) != str.charAt(y)) {
                return false;
            }
            y++;
            x--;
        }
        return true;
    }
}