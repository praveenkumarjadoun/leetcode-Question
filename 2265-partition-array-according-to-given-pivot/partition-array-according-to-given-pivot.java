class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> list = new ArrayList<>();

        // Elements smaller than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                list.add(nums[i]);
            }
        }

        // Elements equal to pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                list.add(nums[i]);
            }
        }

        // Elements greater than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}