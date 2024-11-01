class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        if (set.contains(beginWord)) {
            set.remove(beginWord);
        }
        int level = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int j = 0; j < n; j++) {
                String node = q.poll();
                if (node.equals(endWord)) {
                    return level + 1;
                }
                List<String> temp = helper(node, set);
                for (int i = 0; i < temp.size(); i++) {
                    if (set.contains(temp.get(i))) {
                        q.add(temp.get(i));
                        set.remove(temp.get(i));
                    }
                }
            }
            level++;
        }
        return 0;
    }
    public List<String> helper(String node, Set<String> set) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < node.length(); i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (ch == node.charAt(i)) {
                    continue;
                }
                String s = node.substring(0, i) + ch + node.substring(i+1, node.length());
                if (set.contains(s)) {
                    ans.add(s);
                }
            }
        }
        return ans;
    }
}