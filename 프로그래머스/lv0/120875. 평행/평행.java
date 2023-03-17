class Solution {
    public double parallel (int[] dot1, int[] dot2) {
        
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        if(parallel(dots[0], dots[1]) == parallel(dots[2], dots[3])) {
            return answer = 1;
        }
        if(parallel(dots[0], dots[2]) == parallel(dots[1], dots[3])) {
            return answer = 1;
        }
        if(parallel(dots[0], dots[3]) == parallel(dots[1], dots[2])) {
            return answer = 1;
        }
        return answer;
    }
}