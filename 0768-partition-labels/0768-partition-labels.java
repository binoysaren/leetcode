class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        int n = s.length();
        Map<Character, Integer> pre = new HashMap<>();
        Map<Character, Integer> suf = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(s.charAt(i))) {
                pre.put(s.charAt(i), i);
            }
            set.add(s.charAt(i));
        }
        set.clear();
        for (int i = n - 1; i >= 0; i--) {
            if (!set.contains(s.charAt(i))) {
                suf.put(s.charAt(i), i);
            }
            set.add(s.charAt(i));
        }
        // System.out.println(pre);
        // System.out.println(suf);
        int[][] interval = new int[set.size()][2];
        int index = 0;
        for (char i : pre.keySet()) {
            interval[index][0] = pre.get(i);
            interval[index][1] = suf.get(i);
            index++;
        }
        // for(int[] i:interval){
        //     for(int j:i){
        //         // System.out.print(j+" ");
        //     }
        //     // System.out.println();
        // }
        int[] alpha = new int[n];
        for (int[] i : interval) {
            alpha[i[0]]++;
            alpha[i[1]]--;
        }
        int sum = 0;
        int left = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            sum += alpha[i];
            alpha[i] = sum;
            // System.out.print(alpha[i]+" ");
            if (flag) {
                if (alpha[i] != 0 || alpha[i] == 0) {
                    left = i;
                    flag = false;
                }
            }
            if (alpha[i] == 0) {
                list.add(i - left + 1);
                flag = true;
            }
        }
        return list;
    }
}