
T = int(raw_input())

while T > 0:
	A = raw_input()
	B = raw_input()
	res = ''
	n = max(len(A), len(B))
	A += '0' * (n - len(A))
	B += '0' * (n - len(B))
	for i in xrange(n):
		if (A[i] == '1') and (B[i] == '1'):
			res += '1'
		else:
			res += '0'
	if res.find('1') == -1:
		print "relatively prime"
	else:
		print res[ : res.rfind('1') + 1]
	T -= 1
