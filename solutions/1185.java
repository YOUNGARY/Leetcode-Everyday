class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String weeks[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int idx = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        return weeks[idx];
    }
}