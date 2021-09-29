def reorder(arr, n):
    j = 0 
    for i in range(n):
        if arr[i] != 0:
            arr[j] = arr[i]
            j+=1
    for i in range(j, n): 
        arr[i] = 0


arr = list(map(int, input().split())) # 배열 입력받기
n = len(arr)
reorder(arr, n)
print(arr)