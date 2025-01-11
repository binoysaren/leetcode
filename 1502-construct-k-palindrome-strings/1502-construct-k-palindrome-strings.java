class Solution {
    public boolean canConstruct(String s, int k) {
       int n=s.length();
       if(n==k) return true;
       if(k>n) return false;
       Map<Character,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       } 
       int count=0;
       int even=0;
       int odd=0;
       for(char i:map.keySet()){
          if(map.get(i)%2==0){
            even++;
          }
          else{
            odd++;
          }
       }
       if(odd<=k) return true;
       return false;
    }
}