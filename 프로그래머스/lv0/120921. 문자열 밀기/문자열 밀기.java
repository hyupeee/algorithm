class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = B+B;
        answer = str.indexOf(A);
        return answer;
    }
}