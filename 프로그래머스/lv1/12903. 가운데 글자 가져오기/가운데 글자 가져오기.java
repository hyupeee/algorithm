class Solution {
    public String solution(String s) {
        if(s.length() % 2 != 0) {
            char answer = s.charAt((s.length() - 1) / 2);
            return String.valueOf(answer);
        } else {
            String answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            return answer;
        }
        
    }
}