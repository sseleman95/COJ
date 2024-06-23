#include <algorithm>
#include <iostream>
#include <vector>
#include <memory>

using namespace std;

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  vector<int> numbers;
  int num;
  char c;
  while (!cin.eof())
  {
    cin >> num >> c;
    numbers.push_back(num);
  }
  sort(numbers.begin(), numbers.end());
  cout << numbers[0];
  for (int i = 1; i < numbers.size(); ++i)
  {
    cout << "+" << numbers[i];
  }
  cout << endl;
  return EXIT_SUCCESS;
}