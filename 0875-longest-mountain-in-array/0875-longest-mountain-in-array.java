class Solution {
    public int longestMountain(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                list.add(i);
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = list.get(i); j >= 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
            for (int k = list.get(i); k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    count++;
                } else {
                    break;
                }
            }
            maxi = Math.max(maxi, count+1);
        }
        return maxi==Integer.MIN_VALUE?0:maxi;
    }
}