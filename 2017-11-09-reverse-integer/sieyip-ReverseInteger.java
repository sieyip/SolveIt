class Solution {
    public int reverse(int x) {
            int curVal = x;
            long totVal = 0;
            while (curVal != 0) {
                        int modVal = curVal % 10;
                        totVal = totVal*10 + modVal; 
                        curVal = curVal/10;
                    }
            if (totVal > Integer.MAX_VALUE || totVal < Integer.MIN_VALUE) {
                        return 0;
                    }
            return (int) totVal;
        }
}
