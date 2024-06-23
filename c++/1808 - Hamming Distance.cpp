#include <iostream>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int main()
{
	string c1, c2;
	int i, dis;
	while (cin >> c1)
	{
		if (c1 != "X")
		{
			cin >> c2;
			dis = 0;
			FOR(i, 0, c1.length(), 1)
			{
				if (c1[i] != c2[i])
					dis++;
			}
		}
		else
			break;
		cout << "Hamming distance is " << dis << "." << endl;
	}
	return 0;
}
