def flip(s):
    flipedstring=[]
    for i in range(len(s)):
        if(s[i]=='0'):
            flipedstring.append('1')
        else:
            flipedstring.append('0')
    return ''.join(flipedstring)
def generateSequence(n):
    global res
    if n==1:
        return res
    else:
        res=res+flip(res)
        return generateSequence(n-1)
n=int(input())
k=int(input())
res='0'
result=generateSequence(n)
print(result)
print(result[k-1])
