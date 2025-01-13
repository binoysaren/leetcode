class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int ans=n;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))>2){
                    ans-=2;
                    map.put(s.charAt(i),map.get(s.charAt(i))-2);
                }
            }
        }
        return ans;
    }
}