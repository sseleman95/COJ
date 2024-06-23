#include <iostream>
#include <iomanip>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>

using namespace std;

int main()
{
    int n, i, j;
    cin >> n;
    while (n--)
    {
        cin >> i;
        j = i - 1;
        cout << i * i + j * j << endl;
    }
}
