class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        if(a == b) {
            answer = a;
        }
        if(a < b) {
            answer = ((b - a + 1) * (a + b)) / 2;
        } else {
            answer = ((a - b + 1) * (a + b)) / 2;
        }
        return answer;
    }
}