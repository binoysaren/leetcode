class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        while (!map.isEmpty()) {
            int first=map.firstKey();
            for (int i = 0; i < groupSize; i++) {
                 int current = first + i;
                if (!map.containsKey(current)) {
                    return false;
                }
                int freq = map.get(current);
                if (freq == 1) {
                    map.remove(current);
                } else {
                    map.put(current, freq - 1);
                }
            }
        }
        return true;
    }
}