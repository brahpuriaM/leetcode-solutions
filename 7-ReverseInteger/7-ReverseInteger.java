class Solution {
    public int reverse(int x) {
        String s = "";
        boolean isNegative = x < 0 ? true : false;
        if(isNegative) {
            x = x * -1;
        }
        while(x > 0) {
            int rem = x % 10;
            s = s + rem;
            x= x / 10;
        }
        int res = 0;
        try {
            res = Integer.parseInt(s);
            if(isNegative) {
                res = res * -1;
            }
        } catch (Exception e) {
            return 0;
        }
        return res;
    }
}