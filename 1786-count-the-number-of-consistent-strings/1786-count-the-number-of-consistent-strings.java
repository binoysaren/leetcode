class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int ans=0;
        for(String s:words){
           if(f(s,set)){
            ans++;
           }
        }
        return ans;
    }
    public boolean f(String str,Set<Character> t){
        int n=str.length();
        int i=0;
        while(i<n){
            if(!t.contains(str.charAt(i))){
               return false;
            }
            i++;
        }
        return true;
    }
}