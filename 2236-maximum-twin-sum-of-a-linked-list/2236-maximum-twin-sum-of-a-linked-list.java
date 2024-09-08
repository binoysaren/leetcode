class Solution {
    public int pairSum(ListNode head) {
        int ans=0;
        int n=0;
        ListNode current=head;
        List<Integer> list=new ArrayList<>();
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        n=list.size();
        if(n==2){
            return list.get(0)+list.get(1);
        }
        for(int i=0;i<(n/2);i++){
           ans=Integer.max(ans,list.get(i)+list.get(n-1-i));
        }
        return ans;
    }
}