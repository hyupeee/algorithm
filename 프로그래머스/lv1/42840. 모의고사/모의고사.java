import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] student_1 = {1, 2, 3, 4 ,5};
        int[] student_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] arr = new int[3];
        
        for(int i = 0; i < answers.length; i ++) {
            if(answers[i] == student_1[i%5]) {
                arr[0] ++;
            }
            if(answers[i] == student_2[i%8]) {
                arr[1] ++;
            }
            if(answers[i] == student_3[i%10]) {
                arr[2] ++;
            }
        }
        
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max == arr[0]) {
            list.add(1);
        }
        if(max == arr[1]) {
            list.add(2);
        }
        if(max == arr[2]) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}