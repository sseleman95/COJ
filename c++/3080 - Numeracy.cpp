
#include <iostream>
#include <string>
#include <utility>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cctype>

using namespace std;

int processOperation(int a, int b, char c)
{
	switch (c)
	{
	case '+':
		return a + b;
	case '-':
		return a - b;
	case '*':
		return a * b;
	case '/':
		if (b != 0)
			return a / b;
		break;
	default:
		throw "invalid operation";
	}
	return 0;
}

int processStr(const string &str, int &index)
{
	int val = 0;
	for (index; index < str.length(); ++index)
	{
		if (isdigit(str[index]))
		{
			val *= 10;
			val += str[index] - '0';
		}
		else if (str[index] == ')')
		{
			return val;
		}
		else if (str[index] == '(')
		{
			val = processStr(str, ++index);
		}
		else if (str[index] == ' ')
		{
		}
		else
		{
			char c = str[index];
			int nextVal = processStr(str, ++index);
			val = processOperation(val, nextVal, c);
		}
	}
	return val;
}

int processStr(const string &str)
{
	int index = 0;
	return processStr(str, index);
}

int main()
{
	int K;
	cin >> K;
	string in;
	char c;
	while (K--)
	{
		cin >> in;
		int a = processStr(in);
		cin >> c;
		cin >> in;
		int b = processStr(in);
		cin >> in;
		int res;
		cin >> res;
		int realRes = processOperation(a, b, c);
		cout << (realRes == res ? "Yes" : "No") << endl;
	}
	return 0;
}