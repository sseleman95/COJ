
f = [2, 3]

while f[-1] <= 5000:
	f.append(f[-2] + f[-1])

fibs = set(f)

Tests = input()

while Tests > 0:
	N = input()
	res = 'Ron'
	if N in fibs:
		res = 'Harry'
	print res, 'wins'
	Tests -= 1

