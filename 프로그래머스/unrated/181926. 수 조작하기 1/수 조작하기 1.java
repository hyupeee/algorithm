class Solution {
    public int solution(int n, String control) {
        String[] strArr = control.split("");
        int num = n;
        for(int i = 0; i < strArr.length; i ++) {
            if(strArr[i].equals("w")) {
                num++;
            }
            if(strArr[i].equals("s")) {
                num--; 
            }
            if(strArr[i].equals("d")) {
                num = num + 10;
            }
            if(strArr[i].equals("a")) {
                num = num - 10;
            }
        }
        return num;
    }
}