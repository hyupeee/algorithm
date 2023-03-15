import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[score.length];
        int x = 0;
        for(int num : score) {
            arr[x] = num;
            int[] temp = arr.clone();
            Arrays.sort(temp);
            
            if(x < k){
                answer[x] = temp[arr.length - x -1];
            }else{
                answer[x] = temp[arr.length - k];
            }
            x++;
        }
        
        return answer;
    }
}