#include <iostream>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

int main()
{
   int y0, i, r;
   cin >> y0;
   FOR(i, 0, 10, 1)
   {
      y0 = (y0 * 13821) % 32768;
      if ((y0 + 1) % 7 == 0)
         r = 7;
      else
         r = (y0 + 1) % 7;
      cout << y0 << " : " << r << endl;
   }
}
