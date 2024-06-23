#include <algorithm>
#include <iostream>
#include <sstream>
#include <vector>
#include <unordered_map>
#include <unordered_set>
#include <memory>
#include <ctype.h>
#include <cmath>

using namespace std;

void solve()
{
  long N, aux;
  unordered_set<int> numberSet;
  cin >> N;
  for (int i = 1; i <= N; ++i)
  {
    if (numberSet.find(i) == numberSet.end())
    {
      cout << i << endl;
    }
  }
  for (int i = 1; i < N; ++i)
  {
    cin >> aux;
    numberSet.insert(aux);
  }
  for (int i = 1; i <= N; ++i)
  {
    if (numberSet.find(i) == numberSet.end())
    {
      cout << i << endl;
    }
  }
}

void solve1()
{
  long N, aux;
  unordered_set<int> numberSet;
  cin >> N;
  for (int i = 1; i <= N; ++i)
  {
    numberSet.insert(i);
  }
  for (int i = 1; i < N; ++i)
  {
    cin >> aux;
    numberSet.erase(aux);
  }
  cout << *numberSet.begin() << endl;
}

void solve2()
{
  vector<unsigned long long int> vec(156251, 0);
  const int LIMIT = 64;
  long N = 64, aux;

  int missing = -1;

  for (int i = 1; i <= N; ++i)
  {
    aux = i;
    if (aux == missing)
    {
      cout << "Missing: " << missing << endl;
      continue;
    }
    --aux;
    int index = aux / LIMIT;
    int bit = aux % LIMIT;
    vec[index] |= (1 << bit);
  }
  for (int i = 0; i <= (N / LIMIT); ++i)
  {
    cout << "index " << i << " = " << vec[i] << endl;
    if (vec[i] <= UINT64_MAX)
    {
      for (int j = 0; j < LIMIT; ++j)
      {
        if ((vec[i] & (1ull << j)) == 0)
        {
          cout << (i * 64) + j + 1 << endl;
          return;
        }
      }
    }
  }
}

void solve3()
{
  long N, sum;
  int aux;
  cin >> N;
  sum = N * (N + 1) / 2;
  for (int i = 1; i < N; ++i)
  {
    cin >> aux;
    sum -= aux;
  }
  cout << sum << endl;
}

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  solve3();
  return EXIT_SUCCESS;
}
