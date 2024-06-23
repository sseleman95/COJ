#include <iostream>
#include <algorithm>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int main()
{
  int n, s[10000], i;
  cin >> n;
  FOR(i, 0, n, 1)
  cin >> s[i];
  sort(s, s + n);
  cout << s[n - 1];
  FOR(i, 0, n - 1, 1)
  cout << " " << s[i];
}
