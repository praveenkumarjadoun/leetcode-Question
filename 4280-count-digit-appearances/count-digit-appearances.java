class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        // int count = 0;
        // char target = (char)(digit+'0');
        // for(int num : nums){
        // String s = String.valueOf(num);
        // char ch[] = s.toCharArray();
        // for(char c : ch){
        //     if(c == target){
        //         count++;
        //     }
        // }
        // }return count;
        int count = 0;
        for(int num :  nums){
            while(num > 0){
                int a = num % 10;
                if(a == digit){
                    count++;
                }
                num /= 10;
            }
        }return count;
    }
}