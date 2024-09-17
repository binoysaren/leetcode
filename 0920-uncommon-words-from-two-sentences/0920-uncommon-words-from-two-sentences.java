class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(var s: (s1+" "+s2).split(" ")){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(var s: hm.keySet()){
          if(hm.get(s)==1){
            list.add(s);
          }
        }
        return list.toArray(new String[0]);
    }
}