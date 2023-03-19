import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();     
        for(int i = 1; i < n; i ++) {
            if(n % i == 1) {
                arr.add(i);
            }
        }
        return answer = arr.get(0);
    }
}