class Solution {
    public String convert(String s, int numRows) {
        if(s.length() <= 1 || numRows == 1 || numRows > s.length()) {
            return s;
        }

        int len = s.length();
        Map<Integer, String> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int k = 0;
        while(k < chars.length) {
            int i=0;
            for(; i<numRows-1; i++) {
                if(k >= chars.length) {
                    break;
                }
                char ch = chars[k];
                if(!map.containsKey(i)) {
                    map.put(i, "");
                }
                map.put(i, map.get(i) + ch);
                k++;
            }
            
            for(int j=i; j>0; j--) {
                if(k >= chars.length) {
                    break;
                }
                char ch = chars[k];
                if(!map.containsKey(j)) {
                    map.put(j, "");
                }
                map.put(j, map.get(j) + ch);
                k++;
            }
        }
        //System.out.println(map);
        String res = "";
        for(int p=0; p<numRows; p++) {
            res += map.get(p);
        }
        return res;
        
    }
}