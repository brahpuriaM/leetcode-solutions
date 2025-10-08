// Last updated: 09/10/2025, 01:42:03
class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        if (s == null || "".equals(s)) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s1 = String.valueOf(chars[i]);
            if (!"]".equals(s1)) {
                stack.push(s1);
            } else {
                String substring = "";
                while (!"[".equals(stack.peek())) {
                    substring = stack.pop() + substring;
                }
                stack.pop();

                String digit = "";
                while (stack.size() > 0 && isInteger(stack.peek())) {
                    digit = stack.pop() + digit;
                }
                String finalStr = "";
                for (int j = 0; j < Integer.valueOf(digit); j++) {
                    finalStr = substring + finalStr;
                }
                stack.push(finalStr);
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }

    private boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}