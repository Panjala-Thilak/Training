def binarySearchLeftMost(array,low,high,k):
    global index
    mid=(low+high)//2
    if(low<=high):
        if(array[mid]==k):
            index=mid
        if(array[mid]>=k):
            return binarySearchLeftMost(array,low,mid-1,k)
        else:
            return binarySearchLeftMost(array,mid+1,high,k)
    return index

def binarySearchRightMost(array,low,high,k):
    global index
    mid=(low+high)//2
    if(low<=high):
        if(array[mid]==k):
            index=mid
        if(array[mid]>k):
            return binarySearchRightMost(array,low,mid-1,k)
        else:
            return binarySearchRightMost(array,mid+1,high,k)
    return index

index=-1
array=list(map(int,input().split(" ")))
k=int(input())
array.sort()
left=binarySearchLeftMost(array,0,len(array)-1,k) #finding the leftmost occurrence of k
right=binarySearchRightMost(array,0,len(array)-1,k) ##finding the rightmost occurrence of k
if(left==-1 and right==-1): #if k is not found in array
    print('0')
else:
    print(right-left+1)
