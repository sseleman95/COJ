#include <bits/stdc++.h>

using namespace std;

int p3(int n)
{
    long long N = n;

    vector<long long> d;
    int i;
    for (i = 1; i * i <= N; i++)
        if (N % i == 0)
        {
            d.push_back(i);
            d.push_back(N / i);
        }
    if (N > 1)
        d.push_back(N);
    sort(d.begin(), d.end());
    set<long long> ss(d.begin(), d.end());
    d = vector<long long>(ss.begin(), ss.end());

    int sol = 0;
    for (int i = 0; i < d.size(); i++)
        for (int j = 0; j < d.size(); j++)
            if (N % (d[i] * d[j]) == 0)
                sol++;

    return sol;
}

typedef long long ll;

int fb(ll N)
{
    int sol = 0;
    for (ll i = 1; i <= N; i++)
        if (N % i == 0)
            for (ll j = 1; j <= N; j++)
                if (N % j == 0 && i * j <= N)
                    for (ll z = 1; z <= N; z++)
                        if (N % i == 0 && j * z == N / i)
                            sol++;
    return sol;
}

int main()
{
    int N;
    cin >> N;
    int sol = p3(N);
    cout << sol;
    return 0;
}