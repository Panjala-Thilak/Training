n=int(input())
for i in range(n+1):
    count=0
    while(i!=0):
        i=i&(i-1)
        count+=1
    print(count,end=",")