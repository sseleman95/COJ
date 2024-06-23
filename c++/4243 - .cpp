#include <bits/stdc++.h>

using namespace std;

typedef unsigned long long ull;
typedef long long ll;

ull mulmod(ull a, ull b, ull c)
{
    a %= c;
    b %= c;
    unsigned long long x = 0, y = a, t;
    while (b)
    {
        if (b & 1)
        {
            t = x + y;
            x = (t > c) ? t - c : t;
        }
        t = y << 1;
        y = (t > c) ? t - c : t;
        b >>= 1;
    }
    return x;
}

long long gcd(long long a, long long b)
{
    return !b ? a : gcd(b, a % b);
}

long long powmod(long long x, long long n, long long mod)
{
    long long ret = 1;
    while (n)
    {
        if (n & 1)
            ret = mulmod(ret, x, mod);
        x = mulmod(x, x, mod);
        n >>= 1;
    }
    return ret;
}

const int range = 1000000;
bool isPrimeA[range + 10];

bool isPrime(long long n)
{
    if (n < 2)
        return false;
    if (n < range)
    {
        if (isPrimeA[n])
            return true;
        return false;
    }
    long long d = n - 1;
    int s = 0;
    while (d % 2 == 0)
        s++, d >>= 1;
    int a[9] = {2, 3, 5, 7, 11, 13, 17, 19, 23};
    for (int i = 0; i < 9; i++)
        if (n == a[i])
            return true;
    for (int i = 0; i < 9; i++)
    {
        bool comp = powmod(a[i], d, n) != 1;
        if (comp)
            for (int j = 0; j < s; j++)
            {
                long long fp = powmod(a[i], (1LL << (long long)j) * d, n);
                if (fp == n - 1)
                {
                    comp = false;
                    break;
                }
            }
        if (comp)
            return false;
    }
    return true;
}

long long brent(long long n)
{
    if (!(n & 1))
        return 2;
    if (!(n % 3))
        return 3;
    const int p[3] = {1, 3, 5};
    long long y, q, x, ys, g, my = 3;
    int i, j, k, m, r, c;
    for (i = 0; i < my; ++i)
    {
        y = 1, r = 1, q = 1, m = 111, c = p[i];
        do
        {
            x = y, k = 0;
            for (j = 1; j <= r; ++j)
                y = (mulmod(y, y, n) + c) % n;
            do
            {
                ys = y;
                for (j = 1; j <= min(m, r - k); ++j)
                {
                    y = (mulmod(y, y, n) + c) % n;
                    q = mulmod(q, abs(x - y), n);
                }
                g = gcd(q, n);
                k += m;
            } while (k < r && g < 2);
            r <<= 1;
        } while (g < 2);
        if (g == n)
            do
            {
                ys = (mulmod(ys, ys, n) + c) % n;
                g = gcd(abs(x - ys), n);
            } while (g < 2);
        if (g != n)
            return g;
    }
    return n;
}

void calc()
{
    for (int k = 0; k < range; ++k)
    {
        isPrimeA[k] = true;
    }
    isPrimeA[0] = isPrimeA[1] = false;
    for (int i = 2; i * i <= range; ++i)
    {
        if (isPrimeA[i])
            for (int j = 2; j * i <= range; ++j)
            {
                isPrimeA[i * j] = false;
            }
    }
}

void factor(ll n, map<ll, ll> &factors)
{
    if (isPrime(n))
    {
        factors[n]++;
        return;
    }
    ll a = brent(n);
    ll b = n / a;
    factor(a, factors);
    factor(b, factors);
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    calc();
    int t;
    cin >> t;
    int cas = 1;
    while (t--)
    {
        map<ll, ll> facto;
        facto.clear();
        ll n;
        cin >> n;
        factor(n, facto);
        ll ans = 1;
        for (auto a : facto)
        {
            if (a.first > 2)
            {
                ans *= ((long long)a.second + 1);
            }
        }
        ans--;
        cout << "case " << cas++ << ": " << ans << endl;
    }
    return 0;
}
