class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int sum = 0;
        boolean isAllNegative = true;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                isAllNegative = false;
            }
            sum += nums[i];
            if(sum < 0) {
                sum = 0;
            }
            if(max < sum) {
                max = sum;
            }
        }
        if(isAllNegative) {
            max = nums[0];
            for(int i=0; i<nums.length; i++) {
                if(max < nums[i]) {
                    max = nums[i];
                }
            }
        }
        return max;
    }
}