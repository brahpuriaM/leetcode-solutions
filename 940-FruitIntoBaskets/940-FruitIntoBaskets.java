// Last updated: 14/12/2025, 19:24:51
class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0;
        int end = 0;
        int maxFruit = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        while (end <= fruits.length) {
            if (basket.size() > 2) {
                basket.merge(fruits[start], -1, Integer::sum);
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]);
                }
                start++;
                continue;
            } else {
                if (end < fruits.length)
                    basket.merge(fruits[end], 1, Integer::sum);
            }
            maxFruit = Math.max(maxFruit, (end - start));
            end++;
        }
        return maxFruit;
    }
}