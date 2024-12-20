class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] s = new int[nums.length];
        Arrays.fill(s, 1);
        int max = 1;
        for(int i = 0; i < nums.length; i++) {
            for (int j=0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    s[i] = Math.max(s[i], 1+s[j]);
                    if(s[i] > max) {
                        max = s[i];
                    }
                }
            }
        }
        return max;
    }
}