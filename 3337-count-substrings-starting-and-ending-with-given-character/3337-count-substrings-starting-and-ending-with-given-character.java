class Solution {
    public long countSubstrings(String s, char c) {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }  
        if(!map.containsKey(c)){
            return 0;
        }
        long ans=map.get(c);
        return (ans*(ans-1)/2)+ans;
    }
   
}
