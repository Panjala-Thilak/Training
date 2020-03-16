array=list(map(int,input().split(" ")))
k=int(input())
count=0
for i in range(len(array)):
    if array[i]==k:
        count+=1

print(count)
