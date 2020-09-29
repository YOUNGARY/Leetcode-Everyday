class Solution {
    public String thousandSeparator(int n) {
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
        while (true) {
            sb.append(n % 10);
            cnt += 1;
            n = n / 10;
            if (n == 0) {
                break;
            }
            if (cnt == 3) {
                sb.append('.');
                cnt = 0;
            }
        }
        return sb.reverse().toString();
    }
}