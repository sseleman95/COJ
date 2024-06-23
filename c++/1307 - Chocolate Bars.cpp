#include <algorithm>
#include <memory>
#include <vector>
#include <string>
#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <utility>

using namespace std;

int main()
{
	std::ios::sync_with_stdio(false);
	cin.tie(NULL);

	int N, aux, bars, length;
	cin >> N;
	int chocolates[10001];
	while (N--)
	{
		cin >> aux;
		bars = aux * 2;

		for (int i = 0; i < bars; ++i)
		{
			cin >> chocolates[i];
		}
		sort(chocolates, chocolates + bars);

		length = -1;
		for (int i = 0; i < aux; ++i)
		{
			int sum = chocolates[i] + chocolates[bars - 1 - i];
			if (length != sum)
			{
				if (length == -1)
					length = sum;
				else
				{
					cout << "YES" << endl;
					length = -1;
					break;
				}
			}
		}

		if (length != -1)
		{
			cout << "NO" << endl;
		}
	}
	return EXIT_SUCCESS;
}
