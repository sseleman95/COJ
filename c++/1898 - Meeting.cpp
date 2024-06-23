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

	int N, A, B, D;
	scanf("%d", &N);
	while (N--)
	{
		scanf("%d %d %d", &A, &B, &D);
		printf("%.4f\n", static_cast<double>(D) / (A + B));
	}
	return EXIT_SUCCESS;
}
