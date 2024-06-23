#include <iostream>
#include <iomanip>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>

using namespace std;

int main()
{
    uint64_t D, V;
    cin >> D >> V;
    bool res = (D == (V * (V - 3)) / 2);
    cout << (res ? "yes" : "no") << endl;
}
