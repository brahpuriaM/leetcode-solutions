// Last updated: 04/08/2025, 21:54:23
class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        //[0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
        //[1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3]
        //[0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
        //[0, 0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2]

        //[4, 4, 4, 4, 4, 5]
        //[5, 5, 5, 5, 5, 5]
        //[4, 4, 4, 4, 4, 4]
        //[0, 2, 4, 1, 2, 0]
        int ans = 0;
        // int maxLeft = height[0];
        // int maxRight = height[height.length - 1];
        // int left = 0;
        // int right = height.length - 1;

        int len = height.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        //int[] minimums = new int[len];

        for(int i=0; i<len; i++) {
            if(i==0) {
                maxLeft[i] = height[0];
            } else {
                maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            }
        }
        for(int i=len-1; i>=0; i--) {
            if(i==len-1) {
                maxRight[i] = height[len-1];
            } else {
                maxRight[i] = Math.max(maxRight[i+1], height[i]);
            }
        }
        for(int j=0; j<len; j++) {
            int min = Math.min(maxLeft[j], maxRight[j]) - height[j];
            ans += min <= 0 ? 0 : min;
        }

        /*while(left < right) {
            if(height[left] maxLeft)
            if(Math.min(maxLeft, maxRight))
        }*/
        return ans;
    }
}