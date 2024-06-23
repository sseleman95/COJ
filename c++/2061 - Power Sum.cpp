#include <iostream>

using namespace std;

typedef long long LL;

const LL MOD = 1000000007;

LL pot(LL b, int e)
{
    if (e == 0)
        return 1LL;
    if (e & 1)
        return b * pot(b, e - 1) % MOD;
    LL r = pot(b, e >> 1);
    return r * r % MOD;
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        LL x, n;
        cin >> x >> n;
        LL den, num;
        if (x == 1)
            cout << n + 1 << '\n';
        else
        {
            num = x - 1;
            den = (pot(x, n + 1) - 1 + MOD) % MOD;
            num = pot(num, MOD - 2);
            den = (den * num) % MOD;
            cout << den << '\n';
        }
    }
    return 0;
}
