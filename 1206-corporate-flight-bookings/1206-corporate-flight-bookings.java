class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        int sum = 0;
        for (int[] book : bookings) {
            int i = book[0]-1;
            int j = book[1]-1;
            int seat = book[2];
            int index=0;
            int k=i;
            for(int p=i;p<=j;p++){
                ans[p]+=seat;
            }
           
        }
        return ans;
    }
}