def trangle_num(n):
    if(n>0):
        if(n==1):
            return 1
        else:
            return n+trangle_num(n-1)
def trangle_numm(n,k=1):
    if(n>0):
        if(n==1):
            return k
        else:
            return trangle_numm(n-1, k+n)

print(trangle_num(4))
print(trangle_numm(4))
    
