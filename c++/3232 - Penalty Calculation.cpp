#include <iostream>
#include <sstream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

bool sortByTime(const pair<int, string> &sub1, const pair<int, string> &sub2)
{
  return sub1.first < sub2.first;
}

int main()
{
  int k;
  cin >> k;
  vector<pair<int, string>> submissions;
  while (k--)
  {
    int time;
    string veredict;
    cin >> time >> veredict;
    submissions.push_back({time, veredict});
  }

  sort(submissions.begin(), submissions.end(), sortByTime);

  size_t penalties = 0;
  bool wasAccepted = false;
  for (auto &tuple : submissions)
  {
    if (tuple.second[0] == 'A')
    {
      wasAccepted = true;
      penalties += tuple.first;
      break;
    }
    penalties += 20;
  }

  cout << (wasAccepted ? penalties : 0) << endl;
}