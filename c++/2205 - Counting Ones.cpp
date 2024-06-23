#include <iostream>

#define W(T) while (T--)
#define FOR(a, b, c, d) for (a = b; a >= c; a -= d)

using namespace std;

int main()
{
    unsigned long long t, A, B, i, ones = 0, r;
    cin >> t;
    W(t)
    {
        cin >> A >> B;
        FOR(i, B, A, 1)
        {
            r = i;
            while (r != 0)
            {
                if ((r % 2) == 1)
                {
                    r /= 2;
                    ones++;
                }
                else
                    r /= 2;
            }
        }
        cout << ones << endl;
        ones = 0;
    }
}
