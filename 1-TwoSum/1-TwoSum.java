// Last updated: 04/08/2025, 16:31:56
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i= 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new LinkedList<>());
            }
            map.get(nums[i]).add(i);
        }
        System.out.println(map);
        int[] indices = new int[2];
        for(int j= 0; j< nums.length; j++){
            int lookupVal = target - nums[j]; 
            List<Integer> list = map.get(lookupVal);
            if(map.containsKey(lookupVal)) {
                System.out.println(list);
                if(lookupVal * 2 == target) {
                    if(list.size() == 1) {
                        continue;
                    } else {
                        indices[0] = list.get(0);
                        indices[1] = list.get(1);
                        break;
                    }
                } else {
                    indices[0] = list.get(0) > j ? j : list.get(0);
                    indices[1] = list.get(0) > j ? list.get(0) : j;
                    break;
                }
            }
        }
       return indices; 
    }
}