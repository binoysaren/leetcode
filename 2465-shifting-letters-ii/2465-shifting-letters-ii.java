class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] t = new int[n];

        for (int[] shift : shifts) {
            int l = shift[0], r = shift[1], d = shift[2];
            if (d == 0) {
                t[l]--;
                if (r + 1 < n) {
                    t[r + 1]++;
                }
            } else {
                t[l]++;
                if (r + 1 < n) {
                    t[r + 1]--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int shiftAcc = 0;

        for (int i = 0; i < n; i++) {
            shiftAcc += t[i];
            int newIndex = (s.charAt(i) - 'a' + shiftAcc) % 26;
            if (newIndex < 0) {
                newIndex += 26;
            }
            sb.append((char) ('a' + newIndex));
        }

        return sb.toString();
    }
}
