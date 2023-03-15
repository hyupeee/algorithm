class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling ){
            if(str.indexOf("ayaaya") == -1){
                 str = str.replace("aya", ".");
            }
            
            if(str.indexOf("yeye") == -1){
                 str = str.replace("ye", ".");
            }
            
            if(str.indexOf("woowoo") == -1){
                 str = str.replace("woo", ".");
            }
            
            if(str.indexOf("mama") == -1){
                 str = str.replace("ma", ".");
            }
            
            str = str.replace(".", "");
            
            if(str == "") { 
                answer ++;
                
            }
            
            
        }
        return answer;
    }
}