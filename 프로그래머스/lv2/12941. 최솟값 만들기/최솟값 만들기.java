import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] arr = new int[B.length];
        
        int num = 0;
        for(int i = B.length-1; i >= 0; i --) {
            arr[num] += B[i];
            num ++;
        }
        
        for(int i = 0; i < A.length; i ++) {
            answer += A[i] * arr[i];
        }
        return answer;
    }
}