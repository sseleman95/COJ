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

string encrypt(const string &input)
{
  stringstream output;
  for (int i = (input.length() / 2) - 1; i >= 0; --i)
  {
    output << input.at(i);
  }
  if (input.length() % 2)
  {
    output << input.at((input.length() / 2));
  }
  for (int i = input.length() - 1; i > input.length() / 2; --i)
  {
    output << input.at(i);
  }
  if (input.length() % 2 == 0)
  {
    output << input.at((input.length() / 2));
  }
  return output.str();
}

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  string input;
  while (!cin.eof())
  {
    cin >> input;
    cout << encrypt(input) << endl;
  }
  return EXIT_SUCCESS;
}
