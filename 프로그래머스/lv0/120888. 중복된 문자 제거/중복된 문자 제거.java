class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(String str : strArr) {
            if(!answer.contains(String.valueOf(str))) {
                answer += str;
            }
        }
        return answer;
    }
}