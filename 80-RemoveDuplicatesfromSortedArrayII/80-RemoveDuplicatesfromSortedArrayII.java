class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        int count = 1;
        int atMostCount = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                if(atMostCount < 2) {
                    nums[count] = nums[i];
                    count++;
                }
                atMostCount++;
                if(atMostCount == 2 && i == nums.length - 1) {
                    //System.out.println("i : " + i + ", count : " + count);
                    nums[count-1] = nums[i];
                }
                continue;
                
            } else {
                //System.out.println("i : " + i + ", count : " + count);
                nums[count] = nums[i];
                atMostCount = 1;
                count++;
            }
        }
        return count;
    }
}