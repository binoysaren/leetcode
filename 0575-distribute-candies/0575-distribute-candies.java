class Solution {
    public int distributeCandies(int[] candyType) {
       Set<Integer> set=new HashSet<>();
       for(int i:candyType){
        set.add(i);
       }
       int eat=candyType.length/2;
       int n=set.size();
       if(n<eat){
        return n;
       }
       return eat;
    }
}