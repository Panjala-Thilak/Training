array=list(map(int,input().split(" ")))
array.sort()
for i in range(1,len(array)+1):
    if i==array[i-1]:
        continue
    else:
        print(i)
        break
