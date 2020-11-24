class Solution {
    public double angleClock(int hour, int minutes) {
        double a = hour * 5.0 + minutes * 5.0 / 60;
        double res = Math.abs(a - (double) minutes) * 6;
        if (res > 180.0) {
            return 360.0 - res;
        } else {
            return res;
        }
    }
}