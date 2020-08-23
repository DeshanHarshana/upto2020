def fun(a,b):
    if(b==0):
        return 0
    if(b%2==0):
        return fun(a+a,b//2)
    return fun(a+a, b//2)+a
def power(n,p):
    if(p==1):
        return n
    else:
        return n * power(n,p-1)

def power2(n,p):
    sum=1
    for i in range(0,p):
        sum=sum*n
    
    return sum
print(power2(2,3))




print(power(5,3))