def MCD(N,K):
    if K>N: return MCD(K,N)

    if N%K is 0: return K

    return MCD(K,N%K)

r,N=1, input()

for i in xrange(2,N):   r += MCD(i,N) == 1

print r
