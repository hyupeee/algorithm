class Solution {
    public int solution(int n) {
        int realCnt = 0;
    
        for(int i = 1; i < n + 1; i ++) {
            int cnt = 0;
            for(int j = 1; j <= i; j ++) {
                if(i % j == 0) {
                    cnt ++;
                }
            }
            if(cnt >= 3) {
                realCnt ++;
            }
        }
        return realCnt;
    }
}