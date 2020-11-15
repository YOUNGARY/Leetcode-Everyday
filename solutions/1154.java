class Solution {
    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int[] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            months[2] = 29;
        }
        int dayNum = 0;
        for (int i = 1; i < month; i++) {
            dayNum += months[i];
        }
        dayNum += day;
        return dayNum;
    }
}