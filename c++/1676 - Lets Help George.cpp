#include <algorithm>
#include <memory>
#include <vector>
#include <string>
#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <utility>
#include <cmath>

using namespace std;

int main()
{
	std::ios::sync_with_stdio(false);
	cin.tie(NULL);

	uint64_t memoization[10001] = {0};

	int N, cases = 0;
	memoization[1] = 1;
	while (true)
	{
		cin >> N;
		if (N == 0)
			break;

		if (memoization[N] == 0)
		{
			for (int i = 1; i <= N; ++i)
			{
				memoization[N] += i * i;
				memoization[i] = memoization[N];
			}
		}
		cout << "Case " << ++cases << ":\nn = " << N << ", diamonds = " << memoization[N] << endl;
	}
	return EXIT_SUCCESS;
}
