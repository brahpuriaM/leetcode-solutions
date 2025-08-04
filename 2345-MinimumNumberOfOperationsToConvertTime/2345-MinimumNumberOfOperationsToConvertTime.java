// Last updated: 04/08/2025, 16:30:58
class Solution {
    public int convertTime(String current, String correct) {
        if(current == null || correct == null || current.equals(correct)) {
            return 0;
        }
        int currInt = (Integer.parseInt(current.split(":")[0]) * 60) + Integer.parseInt(current.split(":")[1]);
        int corrInt = (Integer.parseInt(correct.split(":")[0]) * 60) + Integer.parseInt(correct.split(":")[1]);
        // System.out.println("currInt : " + currInt + ", corrInt : " + corrInt);
        int[] times = new int[]{60, 15, 5, 1};
        int ans = 0;
        int currTmp = currInt;
        for(int i = 0; i< times.length; i++) {
            if(currTmp >= corrInt) {
                break;
            }
            //System.out.println("time : " + times[i]);
            String opsTmp = minimumOperations(times[i], currTmp, corrInt, 0);
            //System.out.println(opsTmp);
            if (opsTmp != null) {
                String[] ops = opsTmp.split("~");
                currTmp = Integer.parseInt(ops[0]);
                ans += Integer.parseInt(ops[1]);
                //System.out.println("ans : " + ans + ", currTmp : " + currTmp);
            }
        }
        return ans;
    }

    private String minimumOperations(int time, int current, int correct, int counter) {
        //System.out.println("current : " + current + ", correct : " + correct + ", counter : " + counter);
        if(current >= correct) {
            if(current == correct) {
                return current + "~" + counter;
            }
            return (current - time) + "~" + (counter - 1);
        } else {
            return minimumOperations(time, current + time, correct, counter + 1);
        }
    }
}