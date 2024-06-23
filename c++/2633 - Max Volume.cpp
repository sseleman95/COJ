#include <iostream>
#include <stdio.h>

#define PI 3.14159
#define W(t) while (t--)

using namespace std;

int main()
{
    int n;
    string f;
    double r, h, maxi = -1, v;
    cin >> n;
    W(n)
    {
        cin >> f;
        if (f == "C" or f == "L")
        {
            cin >> r >> h;
            v = (f == "C") ? (PI * r * r * h) / 3 : PI * r * r * h;
        }
        else
        {
            cin >> r;
            v = (4 * PI * r * r * r) / 3;
        }
        if (v > maxi)
            maxi = v;
    }
    printf("%.3f", maxi);
    cout << endl;
}
