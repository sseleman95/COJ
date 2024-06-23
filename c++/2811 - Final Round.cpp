#include <iostream>
#include <sstream>
#include <set>
#include <vector>
#include <stdlib.h>
#include <algorithm>

#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

struct Data
{
  Data(string nom, string career, int points) : nom(nom), career(career), points(points) {
                                                };
  string nom, career;
  int points;
};

vector<Data> students;
bool operato(const Data &lhs, const Data &rhs)
{
  return lhs.nom < rhs.nom;
}

bool Careers(set<string> carreras, string bCar)
{
  set<string>::iterator it;
  for (it = carreras.begin(); it != carreras.end(); ++it)
    if (bCar == *it)
      return true;
  return false;
}

bool Compare(string nom, string carr, int points)
{
  int i;
  FOR(i, 0, students.size(), 1)
  {
    if (students[i].career == carr)
    {
      if (students[i].points < points)
        return true;
      else
      {
        if (students[i].points == points)
        {
          students.push_back(Data(nom, carr, points));
          return false;
        }
      }
    }
  }
  return false;
}

void eraseAll(string carr)
{
  int i;
  FOR(i, 0, students.size(), 1)
  {
    if (students[i].career == carr)
    {
      students.erase(students.begin() + i);
      i--;
    }
  }
}

int toInteger(string n)
{
  int newN;
  stringstream ss;
  ss << n;
  ss >> newN;
  return newN;
}

int main()
{
  set<string> carreras;
  int t, i = 0, j, point, pos;
  string nom, carr, subS, li;
  while (getline(cin, li))
  {
    if (i == 0)
    {
      t = toInteger(li);
      i++;
    }
    else
    {
      if (li.empty())
      {
        sort(students.begin(), students.end(), operato);
        cout << "List " << i << endl;
        FOR(j, 0, students.size(), 1)
        cout << students[j].nom << " " << students[j].career << endl;
        carreras.clear(), students.clear();
        t--, i++;
        if (t == 0)
          break;
      }
      else
      {
        pos = li.find_last_of(" ");
        subS = li.substr(pos + 1, li.length() - 1);
        point = toInteger(subS);
        subS = li.substr(0, pos);
        carr = subS.substr(subS.find_last_of(" ") + 1, subS.length() - 1);
        nom = subS.substr(0, subS.find_last_of(" "));
        if (Careers(carreras, carr) == false)
        {
          students.push_back(Data(nom, carr, point));
          carreras.insert(carr);
        }
        else
        {
          if (Compare(nom, carr, point) == true)
          {
            eraseAll(carr);
            students.push_back(Data(nom, carr, point));
          }
        }
      }
    }
  }
  sort(students.begin(), students.end(), operato);
  cout << "List " << i << endl;
  FOR(j, 0, students.size(), 1)
  cout << students[j].nom << " " << students[j].career << endl;
}
