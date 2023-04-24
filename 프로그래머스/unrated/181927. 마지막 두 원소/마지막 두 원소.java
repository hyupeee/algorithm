import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int a : num_list) {
            list.add(a);
        }
        
        if(list.get(list.size() - 1) > list.get(list.size() - 2)) {
            list.add(list.get(list.size() - 1) - list.get(list.size() - 2));
        } else {
            list.add(list.get(list.size() - 1) * 2);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}