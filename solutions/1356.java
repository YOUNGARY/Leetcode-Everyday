class Solution {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int cnt1 = countOne(arr[j]), cnt2 = countOne(arr[j + 1]);
                if ((cnt1 > cnt2) || (cnt1 == cnt2 && arr[j] > arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
            }
        }
        return arr;
    }

    public int countOne(int num) {
        int cnt = 0;
        while (num != 0) {
            cnt = (num & 1)== 1 ? cnt + 1 : cnt;
            num >>= 1;
        }
        return cnt;
    }
}