class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        for (int c : candies) {
            if (c > maxCandies) {
                maxCandies = c;
            }
        }

        // Compared to ArrayList, LinkedList has better performance for insert operation
        List<Boolean> ans = new LinkedList<>();
        for (int c : candies) {
            ans.add((c + extraCandies >= maxCandies));
        }
        return ans;
    }
}