class Solution {
    public int subtractProductAndSum(int n) {
        int multiply = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            multiply *= digit;
            sum += digit;
            n /= 10;
        }
        return multiply - sum;
    }
}