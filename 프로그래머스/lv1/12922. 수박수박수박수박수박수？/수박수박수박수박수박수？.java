class Solution {
    public String solution(int n) {
        String answer = "수";
        String su = "수";
        String bak = "박";
        if(n == 1) {
            return answer;
        }
        for(int i = 1 ; i < n; i ++) {
            if(i % 2 == 0) {
                answer += su;
            } else {
                answer += bak;
            }
        }
        return answer;
    }
}