class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1, y1, x2, y2;
        x1 = Integer.max(rec1[0], rec2[0]);
        y1 = Integer.max(rec1[1], rec2[1]);
        x2 = Integer.min(rec1[2], rec2[2]);
        y2 = Integer.min(rec1[3], rec2[3]);
        return x1 < x2 && y1 < y2;
    }
}