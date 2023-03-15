class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 0; i < number; i ++) {
            int num = i + 1;
            

            int count = 0;
            for (int j = 1; j * j <= num; j++) {
                if (j * j == num) count++;
                else if (num % j == 0) count += 2;
            }


            
            if(limit < count) {
                answer += power;
            } else {
                answer += count;
            }
        }
        
        return answer;
    }
}