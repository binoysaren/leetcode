class Solution {
    public int maxDistToClosest(int[] seats) {
       int n=seats.length;
       int first=0;
       int last=0;
       int count=0;
       int ans=0;
       int i = 0;
        while (i < n && seats[i] == 0) {
            first++;
            i++;
        }
        for (; i < n; i++) {
            if (seats[i] == 0) {
                count++;
            } else {
                if (count > 0) {
                    ans = Math.max(ans, (count + 1) / 2);
                    count = 0;
                }
            }
        }
        for (int j = n - 1; j >= 0 && seats[j] == 0; j--) {
            last++;
        }
        return Math.max(ans, Math.max(first, last));
    }
}