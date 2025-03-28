class Solution {
    public int[] finalPrices(int[] prices) {
        int index = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                prices[i] = prices[i] - prices[index];
            }
            index=-1;
        }
        return prices;
    }
}