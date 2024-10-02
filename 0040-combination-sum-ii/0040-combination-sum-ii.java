class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        recur(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    public void recur(List<List<Integer>> ans, List<Integer> list, int[] a, int target, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || index == a.length) {
            return;
        }
         for (int i = index; i < a.length; i++) {
            if (i > index && a[i] == a[i - 1]) continue; 
            if (a[i] > target) break;
            list.add(a[i]);
            recur(ans, list, a, target - a[i], i + 1); 
            list.remove(list.size() - 1);
        }
    }
}
