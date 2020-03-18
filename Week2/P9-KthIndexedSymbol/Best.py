def kthindex(n,k):
    if(n==1):
        return 0
    if(n==2):
        return 0 if k==1 else 1   # Row: 01, returing on the basis of K value.           
    if(k>((pow(2,(n-1)))//2)):   #Checking if Kth index lies on the right side of "Middle of total row length 
        temp=kthindex(n-1,(k-(pow(2,(n-2)))//2))
        return 0 if temp==0 else 1 #returning the complement as the right side is just the complement of left side
    else:
        return kthindex(n-1,k);   # If on the left side..
        

n=int(input())
k=int(input())
print(kthindex(n,k))