import java.util.*;

class Solution {
    
    public int solution(int[] sides) {
        int longS = Math.max(sides[0], sides[1]);
        int shortS = Math.min(sides[0], sides[1]);
        
        int max = longS + shortS;
        int min = longS - shortS;
        
        return max - min - 1;
    }
}