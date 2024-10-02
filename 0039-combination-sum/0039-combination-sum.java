class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
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
        list.add(a[index]);
        recur(ans, list, a, target - a[index], index);
        list.remove(list.size() - 1);
        recur(ans, list, a, target, index + 1);
    }
}
