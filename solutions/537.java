class Solution {
    public String complexNumberMultiply(String a, String b) {
        int a1, b1, a2, b2;
        String[] aa = a.split("\\+", 2);
        a1 = Integer.parseInt(aa[0]);
        b1 = Integer.parseInt(aa[1].substring(0, aa[1].length() - 1));
        String[] bb = b.split("\\+", 2);
        a2 = Integer.parseInt(bb[0]);
        b2 = Integer.parseInt(bb[1].substring(0, bb[1].length() - 1));
        int resA = a1 * a2 - b1 * b2;
        int resB = a1 * b2 + a2 * b1;
        return resA + "+" + resB + "i";
    }
}