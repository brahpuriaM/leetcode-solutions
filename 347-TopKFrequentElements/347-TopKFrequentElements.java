// Last updated: 31/08/2025, 01:55:34
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            minHeap.offer(entrySet);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int j = 0;
        while (!minHeap.isEmpty()) {
            res[j] = minHeap.poll().getKey();
            j++;
        }
        return res;
    }
}