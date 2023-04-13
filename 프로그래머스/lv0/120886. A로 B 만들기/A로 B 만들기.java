import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String be = "";
        String af = "";
        
        for(String str : beforeArr) {
            be += str;
        }
        
        for(String str : afterArr) {
            af += str;
        }
        
        if(be.equals(af)) {
            return 1;
        } else {
            return 0;
        }
    }
}