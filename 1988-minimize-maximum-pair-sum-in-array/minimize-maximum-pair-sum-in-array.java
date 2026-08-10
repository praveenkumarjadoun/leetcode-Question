class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int maxSum = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            maxSum = Math.max(sum, maxSum);
            i++;
            j--;
        }return maxSum;
    }
}