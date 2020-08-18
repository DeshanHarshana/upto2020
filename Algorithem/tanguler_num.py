def tr_num(n):
    if(n==1):
        return 1
    else:
        print(n+tr_num(n))
        return n+tr_num(n-1)
tr_num(3)