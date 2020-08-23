def sum(m,n):
    if(m==n):
        return n
    else:
        return n+sum(m,n-1)

def pow(num, power):
    if(power==1):
        return num
    else: return num*pow(num,power-1)

print(sum(0,3))
print(pow(2,2))