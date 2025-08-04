// Last updated: 04/08/2025, 16:31:04
class Solution {
    public int smallestNumber(int n) {
        String v = Integer.toBinaryString(n);
        String small = ""; //new String(v);
        char[] c = v.toCharArray();
        for(int i=0; i<c.length; i++) {
            char tmp = c[i];
            if(c[i] != '1') {
                tmp = '1';
            }
            small += tmp;
        }
        //System.out.println(v);
        //System.out.println(small);
        return Integer.parseInt(small, 2);
    }
}