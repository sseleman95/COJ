#include <bits/stdc++.h>

using namespace std;

const int MAXN = 20001;
const double EPS = 0.000000001;

typedef long long LL;

LL n;
double A[MAXN];

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int t = 0;
	while (1)
	{
		int R;
		t++;
		cin >> n >> R;

		if (n == 0)
			break;

		for (int i = 1; i <= n; i++)
			cin >> A[i];

		stable_sort(A + 1, A + n + 1);

		LL sol = n * (n - 1) * (n - 2) / 6;

		int i = 1;
		while (i <= n && A[i] < 180.0)
		{
			int j = upper_bound(A + i + 1, A + n + 1, A[i] + 180.0 + EPS) - A - 1;
			int k = j - i;
			sol -= k * (k - 1) / 2;
			i++;
		}

		while (i <= n)
		{
			int j = upper_bound(A + 1, A + n + 1, A[i] - 180.0 + EPS) - A - 1;
			int k = n - i + j;
			sol -= k * (k - 1) / 2;
			i++;
		}

		cout << "Case " << t << ": " << sol << '\n';
	}
}