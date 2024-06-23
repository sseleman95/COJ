#include <iostream>
#include <iomanip>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>

using namespace std;

int main()
{
    string name;
    int a, b;
    cin >> name >> a >> b;
    cout << name << ' ' << abs(a - b) << endl;
}
