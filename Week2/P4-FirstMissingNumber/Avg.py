def binarySearch(array,low,high,k):
    mid=(low+high)//2
    if(low<=high):
        if(array[mid]==k):
            return True
        if(array[mid]>=k):
            return binarySearch(array,low,mid-1,k)
        else:
            return binarySearch(array,mid+1,high,k)
    return False

array=list(map(int,input().split(" ")))
array.sort()
length=len(array)
result=length+1
for number in range(1,length+1):
    if(binarySearch(array,0,length-1,number)):
        continue
    else:
        result=number
        break
print(result)
