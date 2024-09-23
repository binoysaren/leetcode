class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int fl = firstList.length;
        int sl = secondList.length;
        List<int[]> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < fl && j < sl) {
            int a = firstList[i][0];
            int b = firstList[i][1];
            int c = secondList[j][0];
            int d = secondList[j][1];
            int start = Math.max(a, c);
            int end = Math.min(b, d);
            if (start <= end) {
                temp.add(new int[] { start, end });
            }
            if (b <= d) {
                i++;
            } else {
                j++;
            }
            index++;
        }
        int[][] ans = new int[temp.size()][2];
        for (int k = 0; k < temp.size(); k++) {
            ans[k] = temp.get(k);
        }
        return ans;
    }
}