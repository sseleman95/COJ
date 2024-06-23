#include <iostream>
#include <cstdio>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <set>
#include <algorithm>
#include <cstring>
#include <cmath>

#define MAXN 1000001
#define MOD 1000000007
#define ll long long
#define ull unsigned long long
#define sf scanf
#define pf printf
#define nint(i) sf("%d", &i);
#define nlong(i) sf("%lld", &i);

using namespace std;

const int lim = 2003;

int N;
int arr[lim];
int dp[lim];

void solve()
{
	cin >> N;

	for (int i = 0; i < N; i++)
		cin >> arr[i];

	fill(dp, dp + N, 1);

	int answ = dp[0];

	for (int i = 1; i < N; i++)
	{
		int idx = i - 1;
		int cnt = dp[i - 1];

		while (cnt > 0 && __gcd(arr[i], arr[idx]) == 1)
		{
			dp[i]++;
			idx--;
			cnt--;
		}
		answ = max(answ, dp[i]);
	}
	cout << answ << "\n";
}

void open_file()
{
	freopen("e:\\lmo.in", "r", stdin);
}

int main()
{
	cin.sync_with_stdio(false);
	cin.tie(0);

	solve();
}
