class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(num);
                res.add(temp);
            }
        }
        int sum=0;
        for(List<Integer> l:res){
            int t=0;
            for(int j:l){
               t=t^j;
            }
            sum+=t;
        }
        return sum;
    }
}