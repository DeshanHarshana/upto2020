def mp_inv(n, mod):
    for i in range(10000):
        if((((i*n)-1))%mod==0):
            return i
print(mp_inv(3,616))