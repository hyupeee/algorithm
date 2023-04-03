class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int num = 0;
        
        for(int i = 0; i < a - 1; i ++) {
            num += date[i];
        }
        num += b - 1;
        
        answer = day[num % 7];
        
        
        return answer;
    }
}