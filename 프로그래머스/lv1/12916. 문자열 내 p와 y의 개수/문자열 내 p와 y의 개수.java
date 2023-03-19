class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
    
        int cntP = 0;
        int cntY = 0;
        
        if((s.contains("p") == false) && (s.contains("y") == false)) {
            return answer = true;
        } 
        
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == 'p') {
                cntP ++;
            }
            if(s.charAt(i) == 'y') {
                cntY ++;
            }
        }
            
        if(cntP != cntY) {
            answer = false;
        }
        
        return answer;
    }
}
