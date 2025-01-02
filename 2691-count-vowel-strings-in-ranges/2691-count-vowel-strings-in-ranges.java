class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fun(words[i]);
        }
        int N = queries.length;
        int[] ans = new int[N];
        int[] prefixSum = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + (arr[i] ? 1 : 0);
        }
        for (int index = 0; index < N; index++) {
            int[] query = queries[index];
            ans[index] = prefixSum[query[1] + 1] - prefixSum[query[0]];
        }

        return ans;
    }

    public boolean fun(String s) {
        char f = s.charAt(0);
        char l = s.charAt(s.length() - 1);
        boolean b1 = false;
        boolean b2 = false;
        if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
            b1 = true;
        }
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
            b2 = true;
        }
        return b1 & b2;
    }
}