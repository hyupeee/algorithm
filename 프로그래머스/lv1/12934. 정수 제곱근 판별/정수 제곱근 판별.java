class Solution {
    public long solution(long n) {
        long answer = 0;
        Double nSqrt = Math.sqrt(n);
        
        if(nSqrt == nSqrt.intValue()) {
            return (long) ((nSqrt + 1) * (nSqrt + 1));
        } else {
            return answer = -1;    
        }
        
        
    }
}