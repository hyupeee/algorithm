import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        int[] ans = new int[str.length];
        for(int i = 0; i < str.length; i ++) {
            ans[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(ans);
        
        answer = String.valueOf(ans[0]) + " " + String.valueOf(ans[ans.length - 1]);
        return answer;
    }
}