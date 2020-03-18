import sys
def minAbsDifference(a,b,c):
    global minimumDifferance
    if minimumDifferance>(abs(max(a,b,c)-min(a,b,c))):
        minimumDifferance=abs(max(a,b,c)-min(a,b,c))

A=list(map(int,input().split(" ")))
B=list(map(int,input().split(" ")))
C=list(map(int,input().split(" ")))
i=len(A)-1
j=len(B)-1
k=len(C)-1
while(i!=-1 and j!=-1 and k!=-1):
    minimumDifferance=abs(max(A[0],B[0],C[0])-min(A[0],B[0],C[0]))
    minAbsDifference(A[i],B[j],C[k])
    maximum= max(A[i], B[j], C[k])
    if A[i] == maximum:
        i -= 1
    elif B[j] == maximum:
        j -= 1
    else: 
        k -= 1

print(minimumDifferance)