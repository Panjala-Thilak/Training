a=int(input())
b=int(input())
c=int(input())
max_ab=bin(a) if len(bin(a))>len(bin(b)) else bin(b)
bin_c=bin(c)
max_length=len(max_ab)-2 if len(max_ab)>len(bin_c) else len(bin_c)-2
a_bin=format(a,'0'+str(max_length)+'b')
b_bin=format(b,'0'+str(max_length)+'b')
c_bin=format(c,'0'+str(max_length)+'b')
count=0
for i in range(max_length):
    if(c_bin[i]=='1'):
        if(a_bin[i]=='0' and b_bin[i]=='0'):
            count+=1
    else:
        if(a_bin[i]=='1'):
            count+=1
        if(b_bin[i]=='1'):
            count+=1
print(count)
