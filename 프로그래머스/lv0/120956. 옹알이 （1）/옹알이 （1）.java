class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String str : babbling ){
            str = str.replace("aya", ".");
            str = str.replace("woo", ".");
            str = str.replace("ye", ".");
            str = str.replace("ma", ".");
            
            str = str.replace(".", "");
            
            if(str == "") { 
                answer ++;
                System.out.println(str);
            }
            
            
        }
        return answer;
    }
}