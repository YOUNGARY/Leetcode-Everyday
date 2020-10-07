class Solution {
    public int findComplement(int num) {
        int comp = 0, original = num;
        while (original != 0) {
            original >>= 1;
            comp = (comp << 1) + 1;
        }

        return num ^ comp;
    }
}