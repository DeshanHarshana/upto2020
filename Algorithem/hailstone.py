def heilstone(n):
    if(n==1):
        print(n,end=" ")
    elif (n%2==0):
        print(n, end=" ")
        heilstone(n//2)
    else:
        print(n,end=" ")
        heilstone(3*n+1)
heilstone(5)