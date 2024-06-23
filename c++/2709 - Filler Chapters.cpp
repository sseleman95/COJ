#include <iostream>
#include <set>

#define W(t) while (t--)

using namespace std;

int main()
{
  int n, p, w;
  set<int> s;
  cin >> n >> p;
  W(p)
  {
    cin >> w;
    s.insert(w);
  }
  cout << n - s.size();
}
