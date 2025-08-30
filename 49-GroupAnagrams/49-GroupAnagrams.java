// Last updated: 30/08/2025, 23:48:11
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            // 2. Sort the character array using Arrays.sort()
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(i);
        }
        for(Map.Entry<String, List<Integer>> entrySet : map.entrySet()) {
            List<String> list = new ArrayList<>();
            for(Integer index : entrySet.getValue()) {
                list.add(strs[index]);
            }
            res.add(list);
        }
        return res;
    }
}