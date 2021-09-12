n, k = input().split() # 한 줄에 입력받은 동전의 종류 개수와 만드려는 동전의 합을 분리
n = int(n) # 동전의 종류 개수는 n에 대입
k = int(k) # 동전의 합은 k에 대입
coinTypes = [] # 동전의 종류 배열
cnt = 0 # 필요한 동전의 최소 개수

# 입력받은 동전의 종류를 배열에 저장
for i in range(n):
    c = int(input())
    coinTypes.append(c)

# 배열에 저장된 동전 종류는 오름차순 순서이므로 내림차순으로 변경하여 array에 저장
array = sorted(coinTypes, reverse=True)

# 그리디 알고리즘 수행
for coin in array:
    cnt += k // coin
    k %= coin

# 필요한 동전 개수 출력
print(cnt)