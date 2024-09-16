class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[] minutes=new int[n];
        int index=0;
        for(String s:timePoints){
            String sh=s.substring(0,2);
            int h=Integer.parseInt(sh);
            String sm=s.substring(3,5);
            int m=Integer.parseInt(sm);
            minutes[index]=h*60+m;
            index++;
        }
        int ans=Integer.MAX_VALUE;
        Arrays.sort(minutes);
        for(int i=1;i<n;i++){
          ans=Math.min(ans,minutes[i]-minutes[i-1]); 
        }
        int circulardif=1440-minutes[n-1]+minutes[0];
        return Math.min(ans,circulardif);
    }
}