class Solution {
    public boolean scoreBalance(String s) {
       int i =0;
       int j =s.length()-1;
       char[] ch = s.toCharArray();
       int left = 0;
       int right = 0;
       while(i <= j){
        int c = ch[i] - 'a' + 1;
        int d = ch[j] - 'a' + 1;
        if(i<j && left == right){
            left+=c;
            right+=d;
            i++;
            j--;
        }else if(left < right){
            left += c;
            i++;
        }else{
            right += d;
            j--;
        }
       }return left == right;

    }
}