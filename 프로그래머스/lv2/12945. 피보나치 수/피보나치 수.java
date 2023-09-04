class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        
        for(int i = 0; i < arr.length; i ++) {
            if(i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else {
                int sum = arr[i - 1] + arr[i - 2];
                arr[i] = sum % 1234567;
            }
        }
        return arr[n];
    }
}