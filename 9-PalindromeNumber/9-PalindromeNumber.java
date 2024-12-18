class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x >= 0 && x < 10) {
            return true;
        }
        if(x < 0) {
            return false;
        }
        char[] c = String.valueOf(x).toCharArray();
        for(int i=0, j=c.length-1; i<c.length; i++) {
            if(i > j) {
                break;
            }
            if(c[i] != c[j]) {
                return false;
            }
            j--;
        }
        /*Stack<Integer> stack = new Stack<>();
        while(x > 0) {
            stack.push(x%10);
            x = x / 10;
        }
        String oppNum = "";
        while(!stack.empty()) {
            oppNum = stack.pop() + oppNum;
        }
        if (String.valueOf(num).equals(oppNum)) {
            return true;
        }*/
        return true;
    }
}