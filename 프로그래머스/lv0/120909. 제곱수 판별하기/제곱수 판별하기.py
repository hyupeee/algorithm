import math

def solution(n):
    num = math.sqrt(n)
    if int(num) ** 2 == n :
        return 1
    else :
        return 2
