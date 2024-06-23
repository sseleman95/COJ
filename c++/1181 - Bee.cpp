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

	uint32_t male, female, prevMale;
	int N;
	while (true)
	{
		cin >> N;
		if (N == -1)
			break;

		male = 0;
		prevMale = 0;
		female = 0;
		for (int i = 1; i <= N; ++i)
		{
			prevMale = male;
			male = female + male + 1;
			female = prevMale;
		}
		cout << male << " " << female + male + 1 << endl;
	}
	return EXIT_SUCCESS;
}
