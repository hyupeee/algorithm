import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] arr_2 = arr.clone();
        Arrays.sort(arr_2);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i ++) {
            if(arr_2[0] != arr[i]) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}