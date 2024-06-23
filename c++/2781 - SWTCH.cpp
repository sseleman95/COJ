#include <iostream>
#include <vector>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int main()
{
    int n, m, s, e, sum, i, op, j;
    cin >> n >> m;
    vector<int> v(n, 0);
    FOR(i, 0, m, 1)
    {
        cin >> op >> s >> e;
        sum = 0;
        if (op == 0)
        {
            FOR(j, s - 1, e, 1)
            v[j] = (v[j] == 1) ? 0 : 1;
        }
        else
        {
            FOR(j, s - 1, e, 1)
            sum += (v[j] == 1) ? 1 : 0;
            cout << sum << endl;
        }
    }
}
