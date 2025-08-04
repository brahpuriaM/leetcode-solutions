// Last updated: 04/08/2025, 16:31:02
import java.util.Random;
class Solution {
    private int[] prefixSum;
    private Random random = new Random();

    public Solution(int[] w) {
        prefixSum = new int[w.length+1];
        for(int i=0; i< w.length; i++) {
            prefixSum[i+1] = prefixSum[i] + w[i];
        }
        
    }
    
    public int pickIndex() {
        int x = 1 + random.nextInt(prefixSum[prefixSum.length - 1]);
        int left = 1;
        int right = prefixSum.length - 1;
        //[2, 5, 3]
        //[0, 2, 7, 10] --> 1, 10
        //Binary search in prefixSum from left to right to find x
        // int index = binarySearch(left, right, x);
        // return index;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefixSum[mid] >= x) {
                // If the mid-index satisfies the condition, we search the left subarray.
                right = mid;
            } else {
                // Otherwise, we search the right subarray.
                left = mid + 1;
            }
        }
        return left - 1;
    }

    private int binarySearch(int left, int right, int x) {
        if(left < right) {
            int mid = (left + right) / 2;
            if(prefixSum[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
            binarySearch(left, right, x);
        }
        return left - 1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */