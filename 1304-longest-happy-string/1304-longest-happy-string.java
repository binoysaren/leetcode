class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder s = new StringBuilder();
        
        // Create a map from characters to their counts
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', a);
        map.put('b', b);
        map.put('c', c);
        
        // While there are still characters left to use
        while (map.get('a') > 0 || map.get('b') > 0 || map.get('c') > 0) {
            // Create an array to keep counts
            int[] arr = {map.get('a'), map.get('b'), map.get('c')};
            char[] chars = {'a', 'b', 'c'};

            // Sort the characters based on their counts (arr)
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (arr[i] < arr[j]) {
                        // Swap both counts and characters
                        int tempCount = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tempCount;
                        
                        char tempChar = chars[i];
                        chars[i] = chars[j];
                        chars[j] = tempChar;
                    }
                }
            }

            // If the current string ends with two of the most frequent character, use the second one
            int len = s.length();
            if (len >= 2 && s.charAt(len - 1) == chars[0] && s.charAt(len - 2) == chars[0]) {
                if (arr[1] == 0) {
                    break; // No other characters to use
                }
                // Add one of the second most frequent character
                s.append(chars[1]);
                map.put(chars[1], map.get(chars[1]) - 1);
            } else {
                // Add two of the most frequent character if possible
                if (arr[0] > 1) {
                    s.append(chars[0]).append(chars[0]);
                    map.put(chars[0], map.get(chars[0]) - 2);
                } else {
                    s.append(chars[0]);
                    map.put(chars[0], map.get(chars[0]) - 1);
                }
            }
        }
        
        return s.toString();
    }
}
