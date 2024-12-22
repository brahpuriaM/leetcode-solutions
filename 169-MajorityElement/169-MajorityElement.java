class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int majority = nums[0], majoritySize = 1;
        for(int i=0; i< nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
            if(map.get(nums[i]) > majoritySize) {
                majoritySize = map.get(nums[i]);
                majority = nums[i];
            }
        }
        return majority;
    }
}