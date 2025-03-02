class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int[] i : nums1) {
            map.put(i[0], i[1]);
        }
        for (int[] i : nums2) {
            if (map.containsKey(i[0])) {
                map.put(i[0], map.getOrDefault(i[0], 0) + i[1]);
            } else {
                map.put(i[0], i[1]);
            }
        }
        int n=map.size();
        int[][] ans=new int[n][2];
        int index=0;
        for(int i:map.keySet()){
            int f=i;
            int s=map.get(i);
            ans[index][0]=f;
            ans[index][1]=s;
            index++;
        }
        return ans;
    }
}