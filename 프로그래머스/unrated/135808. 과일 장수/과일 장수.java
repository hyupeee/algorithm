import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int applebox = score.length / m;
        Arrays.sort(score);
        
        if(score.length % m == 0) {
            for(int i = 0; i < applebox; i ++) {
                answer += score[i * m] * m;
            }
        } else {
            int num = score.length % m;
            for(int i = 0; i < applebox; i ++) {
                answer += score[i * m + num] * m;
            }
        }
        
        return answer;
    }
}