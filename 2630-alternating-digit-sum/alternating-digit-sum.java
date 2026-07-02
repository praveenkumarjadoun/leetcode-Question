class Solution {
    public int alternateDigitSum(int n) {
        int i = 0;
        int j = 0;
        int l = 0;
        boolean check = true;
        while(n > 0){
            if(check){
                int sum = n % 10;
                i += sum;
                check = false;
            }else{
                int sum = n % 10;
                j += sum;
                check = true;
            }
            n /= 10;
            l++;
        }
        if(l %2 == 0){
            return j-i;
        }
        return i-j;
    }
}