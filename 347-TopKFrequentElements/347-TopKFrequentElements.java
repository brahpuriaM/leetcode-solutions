// Last updated: 31/08/2025, 14:12:32
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

    
        for (int i = 0; i < len; i++) {
            res[i] = i == 0 ? 1 : nums[i - 1] * res[i - 1];
        }

        int post = 1;
        for (int j = len - 1; j >= 0; j--) {
            res[j] = res[j] * post;
            post = post * nums[j];
        }
        return res;
    }
}