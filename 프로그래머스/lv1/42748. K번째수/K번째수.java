import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int cnt = 0;
        for(int[] i : commands) {
            int x = i[0];
            int y = i[1];
            int z = i[2];
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int j = x - 1; j < y; j ++) {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            answer[cnt] = list.get(z-1);
            cnt++;
            
        }
        
        return answer;
    }
}