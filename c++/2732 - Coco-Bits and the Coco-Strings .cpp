#include <iostream>
#include <ctype.h>

#define FOR(i, a, b, c) for (i = a; i < b; i += c)

using namespace std;

int main()
{
  int c, i;
  string p;
  cin >> c;
  while (c--)
  {
    cin >> p;
    FOR(i, 0, p.length(), 1)
    {
      if (islower(p[i]))
        p[i] = toupper(p[i]);
      else
        p[i] = tolower(p[i]);
    }
    cout << p << endl;
  }
}
