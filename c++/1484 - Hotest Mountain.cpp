#include <iostream>
#define W(t) while (t--)

using namespace std;

int main()
{
    int T, p = 0, i;
    double m, k = 0.0;
    cin >> T;
    W(T)
    {
        cin >> m;
        p++;
        if (m >= k)
        {
            k = m;
            i = p;
        }
    }
    cout << i << endl;
}
