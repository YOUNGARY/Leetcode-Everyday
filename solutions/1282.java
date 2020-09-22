class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new LinkedList<>();
        int len = groupSizes.length;
        for (int i = 0; i < len; i++) {
            List<Integer> l = map.getOrDefault(groupSizes[i], new LinkedList<>());
            l.add(i);
            map.put(groupSizes[i], l);
            
            if (l.size() == groupSizes[i]) {
                res.add(l);
                map.put(groupSizes[i], new LinkedList<>());
            } 
        }
        return res;
    }
}