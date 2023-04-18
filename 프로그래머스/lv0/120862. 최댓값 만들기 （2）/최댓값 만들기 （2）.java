import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int minus = 0;
        int plus = 0;
        
        minus = numbers[0] * numbers[1];
        plus = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if(minus > plus) {
            return minus;
        } else {
            return plus;
        }
        
     
    }
}