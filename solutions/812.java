class Solution {
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double S = 0;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++)
                for (int k = j + 1; k < len; k++)
                    S = Math.max(S,
                            0.5 * Math.abs(points[i][0] * points[j][1] +
                                    points[j][0] * points[k][1] +
                                    points[k][0] * points[i][1] -
                                    points[i][1] * points[j][0] -
                                    points[j][1] * points[k][0] -
                                    points[k][1] * points[i][0]
                            )
                    );

        return S;
    }
}