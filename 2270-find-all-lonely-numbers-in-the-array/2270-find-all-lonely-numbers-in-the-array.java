class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) {
                list.add(i);
            }
        }
        return list;
    }
}