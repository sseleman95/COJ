#include <iostream>

using namespace std;

int main()
{
    int t, i;
    string n;
    cin >> t;
    while (t--)
    {
        cin >> n;
        if (n[n.length() - 1] == '5' or n[n.length() - 1] == '0')
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
}
