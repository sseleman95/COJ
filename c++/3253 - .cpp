#include <iostream>
#include <map>

using namespace std;

map<string, bool> elementsMap;

int main()
{

	int m;
	int c = 0;

	cin >> m;

	for (int i = 0; i < m; i++)
	{

		int set;
		cin >> set;
		for (int j = 0; j < set; j++)
		{
			string element;
			cin >> element;

			if (elementsMap.count(element) != true)
			{
				elementsMap[element] = true;
				++c;
			}
		}
	}

	cout << c << endl;

	return 0;
}
