#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string sortOrderStr;

bool customOrder(const string &word1, const string &word2)
{
	int pos1, pos2;
	int len1 = word1.length();
	int len2 = word2.length();
	int index = 0;
	do
	{
		const char *char1 = &word1[index];
		const char *char2 = &word2[index];
		++index;
		pos1 = sortOrderStr.find(char1, 0, 1);
		pos2 = sortOrderStr.find(char2, 0, 1);
	} while (pos1 == pos2 && index < len1 && index < len2);

	if (pos1 == pos2)
	{
		return len1 < len2;
	}
	return pos1 < pos2;
}

void printVector(vector<string> &vec)
{
	for (const string &word : vec)
	{
		cout << word << endl;
	}
}

int main()
{
	int cases = 0;
	int wordsAmt;
	do
	{
		cin >> wordsAmt;
		if (wordsAmt == 0)
			break;
		cin >> sortOrderStr;
		vector<string> words;
		while (wordsAmt)
		{
			string word;
			cin >> word;
			words.emplace_back(word);
			--wordsAmt;
		}
		std::sort(words.begin(), words.end(), customOrder);
		cout << "year " << ++cases << endl;
		printVector(words);

	} while (true);
	return 0;
}