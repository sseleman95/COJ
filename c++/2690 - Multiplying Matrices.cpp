#include <iostream>

#define FOR(i, a, b, c) for (i = a; i < b; i += c)

using namespace std;

int main()
{
  int M, N, R, C, i, k, l, sum;
  cin >> N >> M;
  int A[N][M];
  FOR(i, 0, N, 1)
  {
    FOR(l, 0, M, 1)
    cin >> A[i][l];
  }
  cin >> R >> C;
  int B[R][C];
  FOR(i, 0, R, 1)
  {
    FOR(l, 0, C, 1)
    cin >> B[i][l];
  }
  if (M == R)
  {
    int ma[N][C];
    FOR(i, 0, N, 1)
    {
      FOR(k, 0, C, 1)
      {
        sum = 0;
        FOR(l, 0, R, 1)
        sum += A[i][l] * B[l][k];
        ma[i][k] = sum;
      }
    }
    FOR(i, 0, N, 1)
    {
      cout << ma[i][0];
      FOR(l, 1, C, 1)
      cout << " " << ma[i][l];
      cout << endl;
    }
  }
  else
    cout << "The matrices can not be multiplied";
}
