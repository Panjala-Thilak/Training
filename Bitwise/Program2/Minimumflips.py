a=int(input())
b=int(input())
c=int(input())
sum=bin(a+b)
bin_c=bin(c)
max_length=len(sum)-2 if len(sum)>len(bin_c) else len(bin_c)-2
new_bin_c=format(c,'0'+str(max_length)+'b')
new_sum=format(a+b,'0'+str(max_length)+'b')
count=0
for i in range(max_length):
    if(new_sum[i]!=new_bin_c[i]):
        count+=1

print(count)