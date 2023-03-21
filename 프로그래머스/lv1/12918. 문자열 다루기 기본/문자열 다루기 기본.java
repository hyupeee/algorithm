class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if((s.length() == 4) || (s.length() == 6)) {
            try {
                int sNum = Integer.valueOf(s);
                return answer = true;
            } catch(Exception e) {
                return answer;
            }
        }
        return answer;
    }
}