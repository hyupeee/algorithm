import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        
        
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String i : arr) {
            str += i;
        }
        
        return answer = Long.parseLong(str);
    }
}