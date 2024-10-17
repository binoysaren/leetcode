class Solution {
    public int maximumSwap(int num) {
        if (num < 10) return num;
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }
        int n=list.size();
        int ans=0;
        int index1=-1;
        int index2=-1;
        int maxelement=list.get(0);
        int maxeleindex=0;
        for(int i=1;i<n;i++){
           if(list.get(i)>maxelement){
            maxelement=list.get(i);
            maxeleindex=i;
           }
           else if(list.get(i)<maxelement){
            index1=i;
            index2=maxeleindex;
           }
        }
       if (index1 != -1 && index2 != -1) {
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum=sum*10+list.get(i);
        }
        return sum;
    }
}
