class Solution {
    int count;
    public int maxUniqueSplit(String s) {
        count=0;
        Set<String> set=new HashSet<>();
        backtrack(s,set,0);
        return  count;
    }
    public void backtrack(String s,Set<String> set,int index){
        int n=s.length();
        if(index==n){
            count =Math.max(count,set.size());
            return;
        }
        for(int i=index;i<n;i++){
            if(!set.contains(s.substring(index,i+1))){
                set.add(s.substring(index,i+1));
                backtrack(s,set,i+1);
                set.remove(s.substring(index,i+1));
            }
        }
    }
}