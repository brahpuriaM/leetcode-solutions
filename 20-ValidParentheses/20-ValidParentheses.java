// Last updated: 09/10/2025, 01:42:24
class Solution {
    Map<Character, Character> parenthesesMap = new HashMap<>();

    private void initMap() {
        if (parenthesesMap.size() == 0) {
            parenthesesMap.put(')', '(');
            parenthesesMap.put(']', '[');
            parenthesesMap.put('}', '{');
        }
    }

    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        initMap();
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            if (!stack.isEmpty() && parenthesesMap.containsKey(c1)
                    && stack.peek() == parenthesesMap.get(c1).charValue()) {
                stack.pop();
                continue;
            }
            stack.push(c1);
        }
        return stack.isEmpty();
    }
}