class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int a : arr) {
            treeSet.add(a);
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int idx = 1;
        for (int a : treeSet) {
            hashMap.put(a, idx++);
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = hashMap.get(arr[i]);
        }
        return arr;
    }
}