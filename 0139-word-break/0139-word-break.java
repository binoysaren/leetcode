class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] b = new boolean[n + 1];
        int maxi = 0;
        for (String str : wordDict) {
            maxi = Math.max(maxi, str.length());
        }
        b[0] = true;
        int index = 0;
        for (int i = 1; i < n + 1; i++) {
            String st = "";
            if (i > maxi) {
                index = i - maxi;
            }
            for (int j = i; j > index; j--) {
                st = st + s.charAt(j - 1);
                 String re = new StringBuilder(st).reverse().toString();
                   System.out.println(re);
                if (wordDict.contains(re)) {
                    if(b[j-1]){
                        b[i]=true;
                    }
                }
            }
            System.out.println("****");
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(b[i] + " ");
        }
        return b[n];
    }
}
