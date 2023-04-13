class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num < j + 1; num ++) {
            String str = Integer.toString(num);
            String[] arr = str.split("");
            for(String s : arr) {
                if(Integer.parseInt(s) == k) {
                    answer ++;
                }
            }
        }
        return answer;
    }
}