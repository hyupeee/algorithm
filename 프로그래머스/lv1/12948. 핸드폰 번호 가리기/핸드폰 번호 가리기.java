class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int cnt = phone_number.length() - 4;
        phone_number = phone_number.replace(phone_number.substring(0, cnt), "");
        
        String str = "";
        for(int i = 0; i < cnt; i++) {
            str += "*";
        }
        
        answer = str + phone_number;
        return answer;
    }
}