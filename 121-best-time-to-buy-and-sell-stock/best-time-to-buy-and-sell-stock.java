class Solution {
    public int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                    min = nums[i];
                }
                int currProfit = nums[i] - min;

                if (currProfit > profit) {
                    profit = currProfit;
                }

            }
        return profit;
    }
}