class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int curr = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int add = 0;
        for(int i = 0;i < nums.length;i++){
            int n = nums[i];
            while(n > 0){
                int digit = n % 10;
                add += digit;
                n /= 10;
            }
        }
        curr = Math.abs(sum-add);
        return curr;
    }
}