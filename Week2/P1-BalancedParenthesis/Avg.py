def check(string):
    global count
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
        count+=1
        for i in string:
            if i=='0':
                print('(',end="")
            else:
                print(')',end="")
        print()
    else:
        stack.clear()

count=0
n=int(input())
for i in range(pow(4,n)):
    input=format(i,'0'+str(n*2)+'b')
    check(input)
print(count)
