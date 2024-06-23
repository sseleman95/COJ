#include <iostream>

#define FOR(i, a, b, c) for (i = a; i < b; i += c)

using namespace std;

int main()
{
   int p, q, dp[3000], dq[3000], i, j = 0, k = 0;
   cin >> p >> q;
   FOR(i, 1, p + 1, 1)
   {
      if (p % i == 0)
      {
         dp[j] = i;
         j++;
      }
   }
   FOR(i, 1, q + 1, 1)
   {
      if (q % i == 0)
      {
         dq[k] = i;
         k++;
      }
   }
   FOR(i, 0, j, 1)
   {
      FOR(p, 0, k, 1)
      cout << dp[i] << " " << dq[p] << endl;
   }
}
