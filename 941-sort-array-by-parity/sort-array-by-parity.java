class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        for (int x : list2) {
            list1.add(x);
        }
        int ans[] = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            ans[i] = list1.get(i);
        }
        return ans;
    }
}