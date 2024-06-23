#include <vector>
#include <list>
#include <algorithm>
#include <iterator>
#include <cctype>
#include <cstring>
#include <string>
#include <iostream>

using namespace std;

int vectOps(vector<int> a, vector<int> b)
{
	int op = 0;
	int s = 0;
	while (op < a.size())
	{
		s += (a.at(op) * b.at(op));
		op++;
	}
	return s;
}

int main()
{
	cin.tie(0);
	ios::sync_with_stdio(0);
	vector<int> a;
	vector<int> b;
	int aux, n;
	long long int min;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> aux;
		a.push_back(aux);
	}
	for (int j = 0; j < n; j++)
	{
		cin >> aux;
		b.push_back(aux);
	}
	min = vectOps(a, b);
	sort(a.begin(), a.end());
	sort(b.begin(), b.end());
	do
	{
		if (vectOps(a, b) < min)
		{
			min = vectOps(a, b);
		}
	} while (next_permutation(a.begin(), a.end()));
	do
	{
		if (vectOps(a, b) < min)
		{
			min = vectOps(a, b);
		}
	} while (next_permutation(b.begin(), b.end()));
	cout << min << "\n";
	return 0;
}
