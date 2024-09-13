class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> l = new ArrayList<>();
        for (int i : asteroids) {
            while (true) {
                if (l.isEmpty() || i > 0 || l.get(l.size() - 1) < 0) {
                    l.add(i);
                    break;
                } else if (l.get(l.size() - 1) <= -i) {
                    if (l.get(l.size() - 1) < -i) {
                        l.remove(l.size() - 1);
                    } else {
                        l.remove(l.size() - 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int a = l.size();
        int[] ans = new int[a];
        for (int i = 0; i < a; i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
}