#include <iostream>
#include <vector>
#include <memory>

using namespace std;

const int MAX_INDEX = 1501;
vector<int> sequence;

void fillSequence()
{
  sequence.push_back(1);
  for (int i = 2; sequence.size() < MAX_INDEX; ++i)
  {
    int number = i;
    while (number >= 5 && number % 5 == 0)
    {
      number /= 5;
    }
    while (number >= 3 && number % 3 == 0)
    {
      number /= 3;
    }
    while (number >= 2 && number % 2 == 0)
    {
      number /= 2;
    }

    if (number != 1)
    {
      continue;
    }
    sequence.push_back(i);
  }
}

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  fillSequence();
  int index;
  while (true)
  {
    cin >> index;
    if (index == 0)
    {
      break;
    }
    cout << sequence[index - 1] << endl;
  }
  return EXIT_SUCCESS;
}