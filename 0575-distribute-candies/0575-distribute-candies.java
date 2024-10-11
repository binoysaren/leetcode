class Solution {
    public int distributeCandies(int[] candyType) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i:candyType){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       int eat=candyType.length/2;
       int n=map.size();
       if(n<eat){
        return n;
       }
       return eat;
    }
}