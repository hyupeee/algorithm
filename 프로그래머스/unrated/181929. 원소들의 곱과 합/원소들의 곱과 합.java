class Solution {
    public int solution(int[] num_list) {
        int mul = num_list[0];
        int square = 0;
        
        for(int i = 1; i < num_list.length; i ++) {
            mul *= num_list[i];
        }
        
        for(int num : num_list) {
            square += num;
        }
        
        
        return mul < (square * square) ? 1 : 0;
        
        
    }
}