class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int[] result = new int[words.length];
        for (String word : words) {
            trie.insert(word);
        }
        for (int i = 0; i < words.length; i++) {
            result[i] = trie.f(words[i]);
        }
        return result; 
    }
}
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    int prefixCount = 0;
}
class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
            node.prefixCount++;
        }
    }
    public int f(String word) {
        TrieNode node = root;
        int score = 0;
        for (char ch : word.toCharArray()) {
            node = node.children.get(ch);
            score += node.prefixCount;
        }
        return score;
    }
}
