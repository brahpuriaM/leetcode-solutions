class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) {
            return s;
        }
        if(s.length() == 2) {
            char[] chars = s.toCharArray();
            if(chars[0] == chars[1]) {
                return s;
            } else {
                return "" + chars[0];
            }
        }

        char[] charsTmp = s.toCharArray();
        String newS = "";
        int k = 1;
        for(int j=0; j<(s.length() * 2)+1; j++){
            //System.out.println("j : " +j);
            if(j == 0 || j == (s.length() * 2)){
                newS += '#';
            } else {
                if(j % 2 == 0) {
                    newS += '#';
                } else {
                    //System.out.println("k : " +k);
                    newS += charsTmp[k-j];
                    k = k+3;
                }
            }
            //System.out.println("newS : " +newS);
        }
    
        String[] inputs = new String[]{s, newS};
        String[] longStrings = new String[inputs.length];

        //check for odd length palindrome : i-1 and i+1
        for(int p=0; p<inputs.length; p++) {
            //System.out.println("inputs[p] : " + inputs[p]);
            char[] chars = inputs[p].toCharArray();
            String longS = "";
            for(int i=0; i<chars.length; i++) {
                if(i==0){
                    continue;
                }
                String longSTmp = "" + chars[i];
                //System.out.println("i : " +i);
                for(int j=1; i-j>=0 && i+j<=chars.length-1; j++) {
                    //System.out.println("j : " +j);
                    if(chars[i-j] == chars[i+j]){
                        longSTmp = chars[i-j] + longSTmp + chars[i+j];
                    } else {
                        break;
                    }
                }
                if(longSTmp.length() > longS.length())
                    longS = longSTmp;
            }
            longStrings[p] = longS.replaceAll("#","");
        }
        //System.out.println("longStrings[0] : " + longStrings[0] + ", longStrings[1] : " + longStrings[1]);
        return longStrings[0].length() > longStrings[1].length() ? longStrings[0] : longStrings[1];
    }
}