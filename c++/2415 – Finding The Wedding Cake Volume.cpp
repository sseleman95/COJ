#include <iostream>
#include <stdio.h>
#include <math.h>

#define W(T) while (T--)

using namespace std;

int main()
{
    int T, N, R, H;
    double PI = atan(1) * 4, vol = 0.0;
    cin >> T;
    W(T)
    {
        cin >> N;
        W(N)
        {
            cin >> R >> H;
            vol += PI * pow(R, 2) * H;
        }
        printf("%.2f", vol);
        cout << endl;
        vol = 0.0;
    }
}
