def check(string):
    stack=[]
    k=0
    for i in range(len(string)):
        if len(stack)==0:
            stack.append(string[i])
            k+=1
            continue
        if string[i]=='0':
            stack.append(string[i])
            k+=1
        elif string[i]=='1' and stack[k-1]=='0':
            stack.pop()
            k-=1
        else:
            break
    if len(stack)==0:
        for i in string:
            if i=='0':
                print('(',end="")
            else:
                print(')',end="")
        print()
    else:
        stack.clear()


n=int(input())
if n%2==1:
    print("-1")
else:
    for i in range(pow(2,n)):
        input=format(i,'0'+str(n)+'b')
        check(input)