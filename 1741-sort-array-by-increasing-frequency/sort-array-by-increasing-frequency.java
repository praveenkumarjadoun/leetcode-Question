class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums) {
            list.add(num);
        }

        list.sort((a, b) -> {
            if(map.get(a).equals(map.get(b))) {
                return b - a;
            }
            return map.get(a) - map.get(b);
        });

        for(int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}