class Solution {
    public int subtractProductAndSum(int n) {
        int original = n;
        int multiply = 1;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            multiply *= digit;
            n /= 10;
        }
        while(original > 0){
            int digit = original % 10;
            sum += digit;
            original /= 10;
        }
        return multiply-sum;
    }
}