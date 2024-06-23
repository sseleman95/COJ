#include <bits/stdc++.h>

using namespace std;

typedef long long LL;

int N;
LL T, sol;
LL S[1 << 20];
LL SS[1 << 20];

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t = 0;
    while (cin >> N >> T)
    {
        int N2 = N >> 1;
        for (int i = 0; i < N2; i++)
            cin >> S[1 << i];

        sol = 0;
        int lim = 1 << N2;
        for (int msk = 1; msk < lim; msk++)
        {
            S[msk] = S[(msk & -msk)] + S[msk ^ (msk & -msk)];
            if (S[msk] == T)
                sol++;
            SS[msk] = S[msk];
        }

        sort(SS + 1, SS + lim);

        int NM2 = N - N2;
        for (int i = 0; i < NM2; i++)
            cin >> S[1 << i];

        int lim2 = 1 << NM2;
        for (int msk = 1; msk < lim2; msk++)
        {
            S[msk] = S[(msk & -msk)] + S[msk ^ (msk & -msk)];
            if (S[msk] == T)
                sol++;
            LL b = T - S[msk];
            sol += upper_bound(SS + 1, SS + lim, b) - lower_bound(SS + 1, SS + lim, b);
        }

        cout << sol << '\n';

        t++;
    }
    return 0;
}
