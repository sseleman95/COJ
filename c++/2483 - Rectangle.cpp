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
	cin.tie(NULL);
	std::ios::sync_with_stdio(false);
	int xval = 0, yval = 0, x, y;
	for (int i = 0; i < 3; ++i)
	{
		cin >> x >> y;

		if (xval & x)
		{
			xval ^= x;
		}
		else
		{
			xval |= x;
		}

		if (yval & y)
		{
			yval ^= y;
		}
		else
		{
			yval |= y;
		}
		// cout << "\t" << xval << ' ' << yval << endl;
	}
	cout << xval << ' ' << yval << endl;
}
