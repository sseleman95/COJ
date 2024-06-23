#include <algorithm>
#include <memory>
#include <vector>
#include <string>
#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <utility>

using namespace std;

string englishNums[] = {"zero", "one", "two", "three", "four", "five", "six", "seven",
						"eight", "nine", "ten", "eleven", "twelve"};

int main()
{
	std::ios::sync_with_stdio(false);
	cin.tie(NULL);

	int N, aux;
	cin >> N;
	while (N--)
	{
		cin >> aux;
		cout << englishNums[aux] << endl;
	}
	return EXIT_SUCCESS;
}
