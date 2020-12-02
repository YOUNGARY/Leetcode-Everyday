class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : arr) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        List<Integer> res = hashMap.keySet().stream().sorted(Comparator.comparingInt(hashMap::get)).collect(Collectors.toList());
        for (int a : res) {
            if (k == 0 || hashMap.get(a) > k) {
                break;
            } else {
                k -= hashMap.get(a);
                hashMap.remove(a);
            }
        }
        return hashMap.size();
    }
}