l=list(map(int,input().split(',')))
d={}
for i in range(len(l)):
    if l[i] in d.keys():
        d[l[i]]+=1
    else:
        d[l[i]]=1
print(list(d.keys())[list(d.values()).index(1)])