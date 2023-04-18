import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] strArr = s.split(" ");
        List<String> list = new ArrayList<>();
        
        for(String str : strArr) {
            list.add(str);
        }
        
        for(int i = 0; i < list.size(); i ++) {
            if(list.get(i).equals("Z")) {
                list.set(i - 1, "0");
                list.set(i, "0");
            }
        }
        
        for(String str : list) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}