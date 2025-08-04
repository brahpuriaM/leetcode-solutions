// Last updated: 04/08/2025, 16:31:45
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0,j=height.length-1; i<height.length;) {
            int area = 0;
            if(i >= height.length || j<0) {
                break;
            }
            if (height[i] < height[j]) {
                area = height[i] * (j-i);
                i++;
            } else {
                area = height[j] * (j-i);
                j--;
            }
            if (max < area) {
                max = area;
            }
        }
        return max;
    }
}