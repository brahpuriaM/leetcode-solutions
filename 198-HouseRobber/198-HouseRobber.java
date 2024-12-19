class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int currSum = nums[0];
        int prevSum = 0;
        int max = Math.max(prevSum, currSum);

        for(int i=1; i< nums.length; i++) {
            if(nums[i] + prevSum > currSum) {
                int tmp = currSum;
                currSum = nums[i] + prevSum;
                prevSum = tmp;
            } else {
                prevSum = currSum;
            }
            if(max < currSum) {
                max = currSum;
            }
        }
        return max;
    }
}