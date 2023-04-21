class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        if(Integer.parseInt(strA + strB) >= Integer.parseInt(strB + strA)) {
            return Integer.parseInt(strA + strB);
        } else {
            return Integer.parseInt(strB + strA);
        }
    }
}