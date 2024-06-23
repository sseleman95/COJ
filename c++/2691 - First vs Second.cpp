#include <iostream>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int cal(int v)
{
  int i, sum = 0, vv;
  FOR(i, 0, v, 1)
  {
    cin >> vv;
    sum += vv;
  }
  return sum;
}
int main()
{
  int m, n;
  cin >> n >> m;
  n = cal(n);
  m = cal(m);
  if (n == m)
    cout << "tie";
  else
    (n > m) ? cout << "first win" : cout << "second win";
}
