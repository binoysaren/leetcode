class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] arr=new int[n+1];
        arr[1]=1;
        int index=1;
        int base=1;
         while (true) {
            index = (index + (base * k)) % n;
            if (index == 0) index = n;
            if (arr[index] == 1) {
                break;
            }
            arr[index] = 1;
            base++;
        }
        int count=0;
        for(int i=1;i<n+1;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int[] ans=new int[count];
        int ind=0;
        for(int i=1;i<n+1;i++){
            if(arr[i]==0){
                ans[ind++]=i;
            }
        }
        return ans;
    }
}