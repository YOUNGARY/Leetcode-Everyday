class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : arr) {
            if (a % 2 == 0 && hashMap.get(a / 2) != null) {
                return true;
            }
            if (hashMap.get(a * 2) != null) {
                return true;
            }
            hashMap.put(a, 1);
        }
        return false;
    }
}