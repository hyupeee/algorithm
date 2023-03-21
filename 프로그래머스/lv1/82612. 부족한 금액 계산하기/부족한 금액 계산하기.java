class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total_price = 0;
        int price_cnt = 1;
        while(count > 0) {
            total_price += (price * price_cnt);
            count --;
            price_cnt ++;
        }
        
        if(total_price < money) {
            answer = 0;
        } else {
            answer = total_price - money;
        }
        
        
        return answer;
    }
}