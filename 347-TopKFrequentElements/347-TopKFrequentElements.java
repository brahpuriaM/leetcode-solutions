// Last updated: 31/08/2025, 02:01:08
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k== nums.length) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );
        for(int num : map.keySet()) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        int j = 0;
        while (!minHeap.isEmpty()) {
            res[j] = minHeap.poll();
            j++;
        }
        return res;
    }
}