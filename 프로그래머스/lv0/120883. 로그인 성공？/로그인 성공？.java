import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> dbMap = new HashMap<String, String>();
        
        for(String[] strArr : db) {
            dbMap.put(strArr[0], strArr[1]);
        }
        
        if(dbMap.containsKey(id_pw[0])) {
            if(dbMap.get(id_pw[0]).equals(id_pw[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        } else {
            answer = "fail";
        }
        return answer;
    }
}