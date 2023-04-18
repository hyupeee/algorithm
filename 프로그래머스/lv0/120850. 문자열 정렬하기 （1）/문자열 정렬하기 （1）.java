import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] strArr = my_string.split("");
        
        List<Integer> list = new ArrayList<>();
        for(String str : strArr) {
            if(str.matches("[0-9+]")) {
                list.add(Integer.parseInt(str));
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}