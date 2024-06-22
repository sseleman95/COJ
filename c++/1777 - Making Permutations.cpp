#include <iostream>
#include <set>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int n, i, x, cont = 0;
    std::set<int> total;
    cin >> n;
    for (i = 0; i < n; i++)
    {
        cin >> x;
        if (x > n)
        {
            cont++;
        }
        total.insert(x);
    }

    cout << (n - total.size()) + cont;
    return 0;
}