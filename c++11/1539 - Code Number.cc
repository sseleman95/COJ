#include <iostream>
#include <vector>
#include <memory>
#include <string>
#include <sstream>

using namespace std;

string processedStr(string inputStr)
{
  stringstream ss;
  for (char c : inputStr)
  {
    switch (c)
    {
    case '0':
      ss << "O";
      break;
    case '1':
      ss << "I";
      break;
    case '2':
      ss << "Z";
      break;
    case '3':
      ss << "E";
      break;
    case '4':
      ss << "A";
      break;
    case '5':
      ss << "S";
      break;
    case '6':
      ss << "G";
      break;
    case '7':
      ss << "T";
      break;
    case '8':
      ss << "B";
      break;
    case '9':
      ss << "P";
      break;
    default:
      ss << c;
      break;
    }
  }
  return ss.str();
}

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);

  string input;
  getline(cin, input);
  while (!cin.eof())
  {
    getline(cin, input);
    cout << processedStr(input) << endl;
  }
  return EXIT_SUCCESS;
}