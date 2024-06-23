#include <algorithm> // std::sort
#include <iostream>
#include <sstream>
#include <vector>
#include <unordered_map>
#include <unordered_set>
#include <memory>
#include <ctype.h>
#include <cmath>

using namespace std;

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  int maxDots, L, W, cases;
  cin >> cases;
  while (cases--)
  {
    cin >> maxDots >> L >> W;
    int maxPieces = ((maxDots + 1) * (maxDots + 2)) / 2;
    cout << maxPieces * L * W << endl;
  }
  return EXIT_SUCCESS;
}
