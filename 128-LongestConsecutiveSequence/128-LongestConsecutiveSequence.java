// Last updated: 04/08/2025, 16:31:11
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int length = 0;
        for(int j=0; j<nums.length; j++) {
            List<Integer> list = new ArrayList<>();
            if(!set.contains(nums[j] - 1)) {
                int k = nums[j];
                while(set.contains(k)) {
                    list.add(k);
                    k++;
                }
            }
            length = list.size() > length ? list.size() : length;
        }
        return length;
    }
}