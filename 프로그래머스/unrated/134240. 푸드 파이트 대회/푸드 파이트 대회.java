class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String str1 = "";
        
        for(int i = 1; i < food.length; i ++) {
            for(int j = 0; j < (food[i] / 2); j ++) {
                str1 += Integer.toString(i);
            }
        }
        
        String str2 = "";
        
        for(int i = food.length - 1; i > 0; i --) {
            for(int j = 0; j < (food[i] / 2); j ++) {
                str2 += Integer.toString(i);
            }
        }
        
        answer = str1 + "0" + str2;
        
        return answer;
    }
}