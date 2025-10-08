// Last updated: 09/10/2025, 01:42:18
class Solution {

    private static List<List<Integer>> subsets;
    private static List<Integer> tempList;

    public List<List<Integer>> subsets(int[] nums) {
        subsets = new ArrayList<>();
        tempList = new ArrayList<>();
        backtrackNums(0, nums);
        return subsets;
    }

    public void backtrackNums(int index, int[] nums) {
        if (index >= nums.length) {
            List<Integer> list = new ArrayList<>(tempList);
            subsets.add(list);
            return;
        }
        tempList.add(nums[index]);
        backtrackNums(index + 1, nums);
        tempList.remove(tempList.size() - 1);
        backtrackNums(index + 1, nums);
    }
}