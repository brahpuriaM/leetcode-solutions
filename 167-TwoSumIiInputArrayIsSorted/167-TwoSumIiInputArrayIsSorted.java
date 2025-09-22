// Last updated: 22/09/2025, 12:09:41
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        //[1, 3, 4, 5, 7, 10, 11], target = 9
        int[] res = new int[2];
        while (left < numbers.length && right >= 0 && left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            }
        }
        return res;
    }
}