class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        
        for(String str : strArr) {
            if(str.matches("[0-9]+")) {
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}