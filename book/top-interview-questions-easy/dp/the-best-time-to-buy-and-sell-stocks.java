class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        int havent = 0;
        int have = -prices[0];
        for (int i = 1; i < len; i++) {
            havent = Math.max(havent, have + prices[i]);
            have = Math.max(have, -prices[i]);
        }
        return havent;
    }
}
