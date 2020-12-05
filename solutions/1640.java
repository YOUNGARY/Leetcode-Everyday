class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        for (int[] piece : pieces) {
            hashMap.put(piece[0], piece);
        }
        int start = arr[0];
        int idx = 0;
        while (hashMap.get(start) != null) {
            for (int a : hashMap.get(start)) {
                if (arr[idx] == a) {
                    idx++;
                } else {
                    return false;
                }
            }
            if (idx < arr.length) {
                start = arr[idx];
            } else {
                break;
            }
        }
        return idx == arr.length;
    }
}