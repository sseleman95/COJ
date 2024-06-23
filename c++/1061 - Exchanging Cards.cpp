#include <iostream>
#include <algorithm>
#include <set>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int main()
{
  int a, b, i, v;
  set<int> Ali, Bet, d1, d2;
  while (cin >> a >> b)
  {
    if (a == 0 and b == 0)
      break;
    FOR(i, 0, a, 1)
    {
      cin >> v;
      Ali.insert(v);
    }
    FOR(i, 0, b, 1)
    {
      cin >> v;
      Bet.insert(v);
    }
    set_difference(Ali.begin(), Ali.end(), Bet.begin(), Bet.end(), inserter(d1, d1.begin()));
    set_difference(Bet.begin(), Bet.end(), Ali.begin(), Ali.end(), inserter(d2, d2.begin()));
    if (d1.size() < d2.size())
      cout << d1.size() << endl;
    else
      cout << d2.size() << endl;
    Ali.clear();
    Bet.clear();
    d1.clear();
    d2.clear();
  }
}
