N = int(input()) # 대기 중인 사람의 수 N
P = list(map(int, input().split())) # 인출하는데 걸리는 시간 P

P.sort() # 기다리는 시간이 짧은 순서대로(오름차순) 정렬

result = 0 # 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 result

for i in range(N):
    result += P[i] * (N-i)

print(result)