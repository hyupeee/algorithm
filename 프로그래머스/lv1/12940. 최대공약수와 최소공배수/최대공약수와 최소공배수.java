class Solution {
    public int gcd(int n, int m) {
        if(n % m == 0) {
            return m;
        }
        return gcd(m, n % m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int maxNum, minNum;
        maxNum = Math.max(n, m);
        minNum = Math.min(n, m);
        
        answer[0] = gcd(maxNum, minNum);
        answer[1] = (maxNum * minNum) / answer[0];
        
        return answer;
    }
}