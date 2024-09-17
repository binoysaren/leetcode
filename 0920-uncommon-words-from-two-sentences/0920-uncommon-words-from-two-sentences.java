class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        List<String> p=new ArrayList<>();
        List<String> q=new ArrayList<>();
        for(int i=0;i<str1.length;i++){
            p.add(str1[i]);
        }
        for(int i=0;i<str2.length;i++){
            q.add(str2[i]);
        }
        HashMap<String, Integer> frequency1 = new HashMap<>();
        for (String word : str1) {
            frequency1.put(word, frequency1.getOrDefault(word, 0) + 1);
        }
        HashMap<String, Integer> frequency2= new HashMap<>();
        for (String word : str2) {
            frequency2.put(word, frequency2.getOrDefault(word, 0) + 1);
        }
        List<String> list=new ArrayList<>();
        for(String s:str1){
            if(!q.contains(s) && frequency1.get(s)==1){
              list.add(s);
            }
        }
        for(String s:str2){
           if(!p.contains(s) && frequency2.get(s)==1){
            list.add(s);
           }
        }
        String[] ans=list.toArray(new String[0]);
        return ans;
    }
}