class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String str : dic) {
            int cnt = 0;
            for(String spe : spell) {
                if(str.contains(spe)) {
                    cnt ++;
                }
            }
            if(cnt == spell.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}