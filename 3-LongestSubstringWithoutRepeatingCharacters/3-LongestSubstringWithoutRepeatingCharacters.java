// Last updated: 04/08/2025, 16:31:52
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int longest = -1;
        List<Character> visited = new LinkedList<>();
        if(s == null || "".equals(s)){
            return 0;
        }
        if(chars.length == 1) {
            return 1;
        }
        for(int left=0,right = 0; right < chars.length; right++) {
            boolean reset = false;
            if(!visited.contains(chars[right])) {
                visited.add(chars[right]);
            } else {
                reset = true;
            }
            //System.out.println("right : " + right + ", Visited : " + visited);
            longest = longest > visited.size() ? longest : visited.size();
            if(reset) {
                visited = new LinkedList<>();
                if(right == chars.length - 1) {
                    break;
                }
                left = right = left + 1;
                right = left - 1;
            }
        }
        return longest;
    }
}