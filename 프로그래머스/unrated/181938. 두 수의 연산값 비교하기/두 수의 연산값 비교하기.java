class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a) + Integer.toString(b);
        return Integer.parseInt(str) >= 2 * a * b ? Integer.parseInt(str) : 2 * a * b;
    }
}