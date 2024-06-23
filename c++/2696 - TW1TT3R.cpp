#include <iostream>
#include <algorithm>

#define FOR(i, a, b, c) for (i = a; i < b; i += c)

using namespace std;

int main()
{
  int n, m, a, b, i, j, k, pos, pos1;
  cin >> n >> m;
  int ma[n][n], mr[n];
  FOR(i, 0, n, 1)
  FOR(j, 0, n, 1)
  ma[i][j] = 0;
  FOR(i, 0, m, 1)
  {
    cin >> a >> b;
    ma[a - 1][b - 1] = 1;
  }
  i = 0;
  pos = 0;
  pos1 = 0;
  m = 0;
  FOR(j, 0, n, 1)
  {
    FOR(k, 0, n, 1)
    if (ma[j][k] == 1)
    {
      pos1++;
    }
    if (pos1 == pos)
    {
      mr[m] = j + 1;
      m++;
    }
    if (pos1 > pos)
    {
      mr[0] = j + 1;
      pos = pos1;
      m = 1;
    }
    pos1 = 0;
  }
  sort(mr, mr + m);
  cout << mr[0];
  FOR(i, 1, m, 1)
  cout << " " << mr[i];
}
