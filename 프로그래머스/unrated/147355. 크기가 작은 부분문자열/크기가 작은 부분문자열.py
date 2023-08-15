def solution(t, p):
    l = len(p)
    answer = len([int(t[(i-l):(i)]) for i in range(l, len(t)+1) if int(t[(i-l):(i)]) <= int(p)])
    return answer