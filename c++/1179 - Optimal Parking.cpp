#include <iostream>
#include <vector>
#include <algorithm>

#define W(T) while (T--)

using namespace std;

int main()
{
    int t, n, j;
    vector<int> sto;
    cin >> t;
    W(t)
    {
        cin >> n;
        W(n)
        {
            cin >> j;
            sto.push_back(j);
        }
        sort(sto.begin(), sto.end());
        cout << (sto[sto.size() - 1] - sto[0]) * 2 << endl;
        sto.clear();
    }
}
