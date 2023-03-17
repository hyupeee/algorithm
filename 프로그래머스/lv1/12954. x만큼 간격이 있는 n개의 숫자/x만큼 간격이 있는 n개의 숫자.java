class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        answer[0] = num;
        for(int i = 1; i < n; i ++) {
            answer[i] += num + i * num;
            
        }
        return answer;
    }
}