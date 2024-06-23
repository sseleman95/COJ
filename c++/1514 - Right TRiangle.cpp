#include <iostream>
#include <iomanip>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>

using namespace std;

int main()
{
    double A, B, C, area;
    int n;
    cin >> n;
    while (n--)
    {
        cin >> A >> B;
        area = A * B / 2;
        C = area / ((A + B) / 2);
        area = C * C;
        printf("%.5lg\n", area);
    }
}
