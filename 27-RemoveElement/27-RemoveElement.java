class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        /*for(int p = 0; p<nums.length; p++) {
            System.out.print(nums[p] + ", ");
        }*/
        return k;

        /*if(nums.length == 1) {
            if(nums[0] == val)
                return 0;
            else
                return 1;
        }
        int i = 0, j=nums.length-1;
        for(; i<nums.length; i++) {
            while(i>nums.length && nums[i] != val) {
                i++;
            }
            while(j >= 0 && nums[j] == val) {
                j--;
            }
            if(j<0 || i>=nums.length) {
                System.out.println("Break: " + i);
                System.out.println("Break: " + j);
                break;
            }
            if(i < j && nums[i] == val && nums[j] != val) {
                System.out.println("i: " + i);
                System.out.println("j: " +j);
                nums[i] = nums[j];
                nums[j] = val;
            }
        }
        for(int p = 0; p<nums.length; p++) {
            System.out.print(nums[p] + ", ");
        }
        System.out.println("i: " + i);
        nums = Arrays.copyOfRange(nums, 0, i);
        return nums.length;*/
    }
}