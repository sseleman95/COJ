#include <bits/stdc++.h>

using namespace std;

const int MAXN = 22;

typedef unsigned long long ULL;

const ULL MOD = 1700000339;
const ULL MOD2 = 1790000273;

int N;
ULL A[MAXN];
vector<int> primos;
set<pair<ULL, ULL>> sqfp;
ULL H1, H2;
bool MCD1[MAXN][MAXN];

void back(int h, ULL H1, ULL H2)
{
	for (int i = 0; i < primos.size(); i++)
		if (!MCD1[primos[i]][h])
			return;

	primos.push_back(h);

	sqfp.insert(pair<ULL, ULL>(H1, H2));

	for (int i = h + 1; i <= N; i++)
		back(i, H1 * (A[i] % MOD2) % MOD2, H2 * (A[i] % MOD) % MOD);

	primos.pop_back();
}

int main()
{
	cin >> N;

	for (int i = 0; i <= N; i++)
		cin >> A[i];

	for (int i = 0; i <= N; i++)
	{
		for (int j = i; j <= N; j++)
		{
			MCD1[i][j] = MCD1[j][i] = (__gcd(A[i], A[j]) == 1);
		}
	}

	primos.push_back(0);
	H1 = A[0] % MOD2;
	H2 = A[0] % MOD;
	for (int h = 1; h <= N; h++)
		back(h, H1 * (A[h] % MOD2) % MOD2, H2 * (A[h] % MOD) % MOD);

	cout << sqfp.size() << endl;

	return 0;
}