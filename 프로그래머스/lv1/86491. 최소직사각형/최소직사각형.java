class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int cnt = sizes.length;
        int width = 0;
        int height = 0;
        
        for(int i = 0 ; i < sizes.length; i ++) {
            if(sizes[i][0] < sizes[i][1]) {
                int num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num ;
            }
            if(width < sizes[i][0]) {
                width = sizes[i][0];
            }
            if(height < sizes[i][1]) {
                height = sizes[i][1];
            }
        }
        answer = width * height;
        return answer;
    }
}