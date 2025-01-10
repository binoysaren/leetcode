class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (String str : words2) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                temp.put(str.charAt(i), temp.getOrDefault(str.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
                map.put(entry.getKey(), Math.max(map.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }
        for (String s : words1) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                temp.put(s.charAt(i), temp.getOrDefault(s.charAt(i), 0) + 1);
            }
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (temp.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans.add(s);
        }
        return ans;
    }
}
