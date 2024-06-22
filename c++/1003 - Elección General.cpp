#include <iostream>
using namespace std;
int main()
{

	int n, m, T, max_votes;
	int V[1000];
	cin >> T;

	int win[T], ent;

	for (int i = 0; i < T; i++)
	{

		cin >> n >> m;

		for (int j = 0; j < n; j++)
		{
			V[j] = 0;
		}

		for (int x = 0; x < m; x++)
		{

			for (int y = 0; y < n; y++)
			{

				cin >> ent;

				V[y] = V[y] + ent;
			}
		}

		max_votes = 0;
		for (int j = 0; j < n; j++)
		{

			if (V[j] > max_votes)
			{
				max_votes = V[j];
				win[i] = j + 1;
			}
		}

		cout << win[i] << endl;
	}

	return 0;
}
