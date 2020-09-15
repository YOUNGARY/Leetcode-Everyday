class Solution {
    private static final int MAX_N = 205;
    // Binary Indexed Tree
    private static int[] c = new int[MAX_N];

    // The core of BIT
    public int lowbit(int x) {
        return x & (-x);
    }

    /**
     * Add element to BIT array
     *
     * @param p -- element postion
     * @param v -- element value
     */
    public void add(int p, int v) {
        while (p < MAX_N) {
            c[p] += v;
            p += lowbit(p);
        }
    }

    /**
     * Get prefix sum of position `p`
     *
     * @param p -- element position
     * @return r -- result of the prefix sum before p
     */
    int get(int p) {
        int r = 0;
        while (p > 0) {
            r += c[p];
            p -= lowbit(p);
        }
        return r;
    }

    /**
     * According to the problem description, all of rating values are unique.
     * The best method to calculate the number of rating values that are less than rating[i]
     * between [0, i) is to create a bucket array and get the prefix sum of this array.
     * And BIT can query the prefix sum and update the tree structure with O(logN) complexity,
     * which will be the best tools for this problem. By assigning elements that are in rating
     * array `1` and setting other elements `0`, the prefix sum will be the answer for position i.
     * The constraints tell us that n is no more than 200 and rating values are no more than 10^5,
     * so creating a 10^5-length array is wasting. With the purpose of improving the overall algorithm
     * performance, this solution also use discretization. By adding a copy array of rating values, we
     * can use the sorted result. The index of new array elements can help us get the destination in
     * BIT, and calculate MORE and LESS result separately.
     */
    public int numTeams(int[] rating) {
        int len = rating.length;
        // Discretization array to decrease the Memory size
        int[] disc = new int[len];
        // Copy rating array to disc and sort it
        System.arraycopy(rating, 0, disc, 0, len);
        Arrays.sort(disc);

        // iLess -- the number of ratings that are greater than rating[j] between [0, i)
        int[] iMore = new int[len];
        // kLess -- the number of ratings that are less than rating[j] between (i, len]
        int[] kLess = new int[len];
        // iLess -- the number of ratings that are less than rating[j] between [0, i)
        int[] iLess = new int[len];
        // iLess -- the number of ratings that are greater than rating[j] between (i, len]
        int[] kMore = new int[len];

        // Initialization of BIT array
        c = new int[MAX_N];
        // Iterate rating array in increasing order
        for (int i = 0; i < len; i++) {
            // Find the BIT array index
            int id = Arrays.binarySearch(disc, rating[i]) + 1;
            // Get the prefix sum, namely c[id]
            iLess[i] = get(id);
            // Get iMore
            iMore[i] = get(201) - get(id);
            add(id, 1);
        }

        // Reinitialization of BIT array
        c = new int[MAX_N];
        // Iterate rating array in decreasing order
        for (int i = len - 1; i >= 0; i--) {
            int id = Arrays.binarySearch(disc, rating[i]) + 1;
            kLess[i] = get(id);
            kMore[i] = get(201) - get(id);
            add(id, 1);
        }

        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += iLess[i] * kMore[i] + iMore[i] * kLess[i];
        }

        return ans;
    }
}
