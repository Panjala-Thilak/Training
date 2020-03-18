def generateParenthesis(n):
    result=[]
    l=['']*(2*n)
    def checker(l,index,n,start,end):
        if end==n:
            result.append(''.join(l))
        else:
            print(l)
            if start<n:
                l[index]="("
                checker(l,index+1,n,start+1,end)
            if end<start:
                l[index]=")"
                checker(l,index+1,n,start,end+1)

    checker(l,0,n,0,0)
    return result

n=int(input())
result=generateParenthesis(n)
for ans in result:
    print(ans)
print('count=',len(result))
